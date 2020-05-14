package pl.itger.polishAPI.implementation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.mongojack.JacksonCodecRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import pl.itger.polishAPI.io.swagger.api.AisApiDelegate;
import pl.itger.polishAPI.io.swagger.model.*;
import pl.itger.polishAPI.utils.PagingUtils;


import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

import static pl.itger.polishAPI.utils.PagingUtils.*;
import static pl.itger.polishAPI.utils.PagingUtils.getPaginationDir;

@Service
//@Qualifier("AisApiDelegateImpl_2")
@ConditionalOnProperty(name = "AisApiDelegate.implementation.name", havingValue = "AisApiDelegateImpl_2")
public class AisApiDelegateImpl_2 implements AisApiDelegate {
    private MongoDbFactory mongoDbFactory;

    @Autowired
    public AisApiDelegateImpl_2(MongoDbFactory dbFactory) {
        this.mongoDbFactory = dbFactory;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION,
                true);
        return Optional.of(mapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        RequestAttributes reqAttr = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servlReqAttr = (ServletRequestAttributes) reqAttr;
        HttpServletRequest req = null;
        if (servlReqAttr != null) {
            req = servlReqAttr.getRequest();
        }
        return Optional.of(req);
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return getRequest().
                map(r -> r.getHeader("Accept"));
    }


    /**
     * curl -k -v -X POST "https://localhost:8443/v3_0.1/accounts/v3_0.1/getAccount" -H  "accept: application/json" -H  "Accept-Charset: utf-8" -H  "Accept-Encoding: gzip" -H  "Accept-Language: PL-pl" -H  "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTc1OTE2OTg5LCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.K18f4CplNAUViZ00n87AEmddt3Q7GjIZQa_dbRxyne4*" -H  "X-JWS-SIGNATURE: wefewfef" -H  "X-REQUEST-ID: 95215B80-A744-11E9-B4AB-D922C8858915" -H  "Content-Type: application/json" -d "{  \"accountNumber\": \"6011-4221-0209-2707\",  \"requestHeader\": {    \"ipAddress\": \"string\",    \"isDirectPsu\": true,    \"requestId\": \"95215B80-A744-11E9-B4AB-D922C8858915\",    \"sendDate\": \"2019-10-15T20:59:12.601Z\", \"tppId\": \"string\",    \"userAgent\": \"string\", \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTc1OTE2OTg5LCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.K18f4CplNAUViZ00n87AEmddt3Q7GjIZQa_dbRxyne4*\"  }}"
     */
    @Override
    public ResponseEntity<AccountResponse> getAccount(String authorization,
                                                      String acceptEncoding,
                                                      String acceptLanguage,
                                                      String acceptCharset,
                                                      String X_JWS_SIGNATURE,
                                                      String X_REQUEST_ID,
                                                      AccountInfoRequest getAccountRequest) {
        AccountResponse response = new AccountResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        ResponseEntity<AccountResponse> responseEntity;
        if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                Query query = new Query();
                query.addCriteria(Criteria.where("accountNumber").is(getAccountRequest.getAccountNumber()));
                MongoOperations mongoOps = new MongoTemplate(mongoDbFactory);
                AccountInfo accountInfo = mongoOps.findOne(query, AccountInfo.class);
                try {
                    responseHeader.setIsCallback(Boolean.FALSE);
                    responseHeader.setRequestId(getAccountRequest.getRequestHeader().getRequestId());
                    responseHeader.setSendDate(OffsetDateTime.now());
                    response.setResponseHeader(responseHeader);
                    response.setAccount(accountInfo);
                    responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
                } catch (Exception e) {
                    log.error(e.getLocalizedMessage(), e);
                    responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
        } else {
            log.warn("AisApiDelegateImpl : ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }


    /**
     * curl -k -v -X POST "https://localhost:8443/v2_1_2.1/accounts/v2_1_2.1/getAccounts" -H  "accept: application/json" -H  "Accept-Charset: utf-8" -H  "Accept-Encoding: gzip" -H  "Accept-Language: PL-pl" -H  "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTc1OTE2OTg5LCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.K18f4CplNAUViZ00n87AEmddt3Q7GjIZQa_dbRxyne4*" -H  "X-JWS-SIGNATURE: wefewfef" -H  "X-REQUEST-ID: 95215B80-A744-11E9-B4AB-D922C8858915" -H  "Content-Type: application/json" -d "{ \"perPage\":\"2\", \"pageId\": \"0\",  \"requestHeader\": {    \"ipAddress\": \"string\",    \"isDirectPsu\": true,    \"requestId\": \"95215B80-A744-11E9-B4AB-D922C8858915\",    \"sendDate\": \"2019-10-15T20:59:12.601Z\", \"tppId\": \"string\",    \"userAgent\": \"string\", \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTc1OTE2OTg5LCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.K18f4CplNAUViZ00n87AEmddt3Q7GjIZQa_dbRxyne4*\"  }}
     * <p>
     * sample response:
     */
    @Override
    public ResponseEntity<AccountsResponse> getAccounts(String authorization,
                                                        String acceptEncoding,
                                                        String acceptLanguage,
                                                        String acceptCharset,
                                                        String X_JWS_SIGNATURE,
                                                        String X_REQUEST_ID,
                                                        AccountsRequest getAccountsRequest) {
        AccountsResponse response = new AccountsResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        ResponseEntity<AccountsResponse> responseEntity;
        Block printBlock = o -> System.out.println(o);
        final PageInfo pageInfo = new PageInfo();
        HttpStatus hs = HttpStatus.OK;
        if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                final MongoTemplate mongoTmpl = new MongoTemplate(mongoDbFactory);
                List<Bson> pipeline = new LinkedList<>();
                Bson filter_check_exist;// = new BasicDBObject();
                Bson sortOrder;// = new BasicDBObject("$natural", 1);
                Bson filter;// = new BasicDBObject();
//                class FilteringUtil {
//                    Bson filter_check_exist;// = new BasicDBObject();
//                    Bson sortOrder;// = new BasicDBObject("$natural", 1);
//                    Bson filter;// = new BasicDBObject();
//                }
//                FilteringUtil fu = new FilteringUtil();
                final String pageId = getAccountsRequest.getPageId();
                if (isPageIdValid(pageId)) {
                    String p_id = getPageId(pageId);
                    filter_check_exist = Filters.eq("_id", new ObjectId(p_id));
                    switch (getPaginationDir(pageId)) {
                        case PagingUtils.NEXT: {
                            filter = Filters.gt("_id", new ObjectId(p_id));
                            sortOrder = new BasicDBObject("$natural", 1);
                            //pipeline.add(Aggregates.match(Filters.gt("_id", new ObjectId(p_id))));
                            //pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                            break;
                        }
                        case PagingUtils.PREV: {
                            filter = Filters.lt("_id", new ObjectId(p_id));
                            sortOrder = new BasicDBObject("$natural", -1);
                            //pipeline.add(Aggregates.match(Filters.lt("_id", new ObjectId(p_id))));
                            //pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                            break;
                        }
                        default: {
                            filter = new BasicDBObject();
                            sortOrder = new BasicDBObject("$natural", 1);
                            //pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                            break;
                        }
                    }
                } else{
                    filter_check_exist = new BasicDBObject();
                    sortOrder = new BasicDBObject("$natural", 1);
                    filter = new BasicDBObject();
                    //pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                }
                JacksonCodecRegistry jacksonCodecRegistry = JacksonCodecRegistry.withDefaultObjectMapper();
                jacksonCodecRegistry.addCodecForClass(AccountBaseInfo.class);
                MongoCollection<?> coll = mongoTmpl.getDb().getCollection("accountBaseInfo");
                MongoCollection collection_2 = coll.withCodecRegistry(jacksonCodecRegistry);
                boolean exist = collection_2.countDocuments(filter_check_exist) > 0;
                List<AccountBaseInfo> listABI = new ArrayList<>();
                if (exist) {
                    Integer perPage = getAccountsRequest.getPerPage();
                    FindIterable findIterable = collection_2.find(filter).sort(sortOrder);
                    if(perPage != null && perPage>0) {
                        findIterable = findIterable.limit(perPage);
                    }
                    Iterator<Document> documentIterator = findIterable.iterator();
                    List<Document> list = new ArrayList<>();
                    documentIterator.forEachRemaining(list::add);
                    if (list.size() > 0) {
                        String first_id = PagingUtils.PREV + list.get(0).get("_id").toString();
                        String last_id = PagingUtils.NEXT + list.get(list.size() - 1).get("_id").toString();
                        pageInfo.setNextPage(last_id);
                        pageInfo.setPreviousPage(first_id);
                        MongoCursor cursor = findIterable.iterator();
                        while (cursor.hasNext()) {
                            Object obj = cursor.next();
                            try {
                                String jdoc = ((Document) obj).toJson();
                                AccountBaseInfo accountBaseInfo = getObjectMapper().get().readValue(jdoc, AccountBaseInfo.class);
                                listABI.add(accountBaseInfo);
                            } catch (IOException e) {
                                e.printStackTrace();
                                hs = HttpStatus.INTERNAL_SERVER_ERROR;
                                break;
                            }
                            hs = HttpStatus.OK;
                        }
                    }
                } else {
                    hs = HttpStatus.BAD_REQUEST;
                }
                try {
                    responseHeader.setIsCallback(Boolean.FALSE);
                    responseHeader.setRequestId(getAccountsRequest.getRequestHeader().getRequestId());
                    responseHeader.setSendDate(OffsetDateTime.now());
                    response.setResponseHeader(responseHeader);
                    response.setAccounts(listABI);
                    response.setPageInfo(pageInfo);
                    responseEntity = new ResponseEntity<>(response, hs);
                } catch (Exception e) {
                    log.error(e.getLocalizedMessage(), e);
                    responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } else {
            log.warn("AisApiDelegateImpl : ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }

    /**
     * @param authorization
     * @param acceptEncoding
     * @param acceptLanguage
     * @param acceptCharset
     * @param X_JWS_SIGNATURE
     * @param X_REQUEST_ID
     * @param getHoldsRequest
     * @return
     */
    @Override
    public ResponseEntity<HoldInfoResponse> getHolds(String authorization,
                                                     String acceptEncoding,
                                                     String acceptLanguage,
                                                     String acceptCharset,
                                                     String X_JWS_SIGNATURE,
                                                     String X_REQUEST_ID,
                                                     HoldRequest getHoldsRequest) {
        ResponseHeader responseHeader = new ResponseHeader();
        HoldInfoResponse response = new HoldInfoResponse();
        ResponseEntity<HoldInfoResponse> responseEntity;
        PageInfo pageInfo = new PageInfo();
        if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    List<Bson> pipeline = new LinkedList<>();
                    MongoTemplate mongoTmpl = new MongoTemplate(mongoDbFactory);
                    Optional.ofNullable(getHoldsRequest.getAccountNumber()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.eq("AccountNumber", value))));
                    //Optional.ofNullable(getHoldsRequest.getBookingDateFrom()).ifPresent(value -> pipeline.add( Filters.gte("tradeDate", value)));
                    //Optional.ofNullable(getHoldsRequest.getBookingDateTo()).ifPresent(value -> pipeline.add( Filters.lte("tradeDate", value)));
                    Optional.ofNullable(getHoldsRequest.getItemIdFrom()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.gte("itemId", value))));
                    Optional.ofNullable(getHoldsRequest.getMaxAmount()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.lte("amount", value))));
                    Optional.ofNullable(getHoldsRequest.getMinAmount()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.gte("amount", value))));
                    Optional.ofNullable(getHoldsRequest.getTransactionDateFrom()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.gte("transactionDateFrom", value))));
                    Optional.ofNullable(getHoldsRequest.getTransactionDateTo()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.lte("transactionDateTo", value))));
                    Optional.ofNullable(getHoldsRequest.getType()).ifPresent(value -> pipeline.add(Aggregates.match(Filters.gte("type", value))));
                    final String pageId = getHoldsRequest.getPageId();
                    if (isPageIdValid(pageId)) {
                        final String p_id = getPageId(pageId);
                        //filter_check_exist = Filters.eq("_id", new ObjectId(p_id));
                        switch (getPaginationDir(pageId)) {
                            case PagingUtils.NEXT: {
                                pipeline.add(Aggregates.match(Filters.gt("_id", new ObjectId(p_id))));
                                pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                                break;
                            }
                            case PagingUtils.PREV: {
                                pipeline.add(Aggregates.match(Filters.lt("_id", new ObjectId(p_id))));
                                pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                                break;
                            }
                            default: {
                                pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                                break;
                            }
                        }
                    } else {
                        pipeline.add(Aggregates.sort(Sorts.ascending("_id")));
                    }
                    JacksonCodecRegistry jacksonCodecRegistry = JacksonCodecRegistry.withDefaultObjectMapper();
                    jacksonCodecRegistry.addCodecForClass(HoldInfo.class);
                    MongoCollection<Document> coll = mongoTmpl.getDb().getCollection("holdInfo");
                    MongoCollection<Document> collection_2 = coll.withCodecRegistry(jacksonCodecRegistry);
                    AggregateIterable<Document> aggIter = collection_2.aggregate(pipeline);
                    List<Document> list = new ArrayList<>();
                    aggIter.iterator().forEachRemaining(list::add);
                    List<HoldInfo> listHI = new ArrayList<>();
                    if (list.size() > 0) {
                        String first_id = PagingUtils.PREV + list.get(0).get("_id").toString();
                        String last_id = PagingUtils.NEXT + list.get(list.size() - 1).get("_id").toString();
                        pageInfo.setNextPage(last_id);
                        pageInfo.setPreviousPage(first_id);
                        MongoCursor<Document> cursor = aggIter.iterator();
                        Gson gson = new Gson();
                        while (cursor.hasNext()) {
                            Document obj = cursor.next();
                            listHI.add(gson.fromJson(obj.toJson(), HoldInfo.class));
                        }
                    }
                    responseHeader.setIsCallback(Boolean.FALSE);
                    responseHeader.setRequestId(getHoldsRequest.getRequestHeader().getRequestId());
                    responseHeader.setSendDate(OffsetDateTime.now());
                    response.setResponseHeader(responseHeader);
                    response.setHolds(listHI);
                    response.setPageInfo(pageInfo);
                    responseEntity = new ResponseEntity<HoldInfoResponse>(response, HttpStatus.OK);
                } catch (Exception e) {
                    log.error(e.getLocalizedMessage(), e);
                    responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } else {
            log.warn("AisApiDelegateImpl : ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }




    @Override
    public ResponseEntity<TransactionsDoneInfoResponse> getTransactionsDone(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionInfoRequest getTransactionsDoneRequest
    ) {
        if (getObjectMapper().
                isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                getTransactionsDoneRequest.getAccountNumber();
                getTransactionsDoneRequest.getBookingDateFrom();
                getTransactionsDoneRequest.getBookingDateTo();
                getTransactionsDoneRequest.getItemIdFrom();
                getTransactionsDoneRequest.getMaxAmount();
                getTransactionsDoneRequest.getMinAmount();
                getTransactionsDoneRequest.getPageId();
                getTransactionsDoneRequest.getPerPage();
                getTransactionsDoneRequest.getTransactionDateFrom();
                getTransactionsDoneRequest.getTransactionDateTo();
                getTransactionsDoneRequest.getType();
            }
        }
        return AisApiDelegate.super.getTransactionsDone(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransactionsDoneRequest); //To change body of generated methods, choose Tools | Templates.
    }

}
