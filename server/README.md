# PSD2 PolishAPI 2_1_2
This is a sample implementation of [PSD2](https://en.wikipedia.org/wiki/Payment_Services_Directive)
[Polish API 2_1_2 version](https://polishapi.org/en/).
## Getting Started
In this case study I tried to get the best from Swagger code generator and the best software engineering practicies to obtain a maintainable project. Main patterns I used are Delegation, Loose Coupling, Separation of Responsibilities and others.
## Prerequisites
* [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [swagger-codegen](https://github.com/swagger-api/swagger-codegen)
* [maven](https://maven.apache.org/)
* [MongoDB](https://www.mongodb.com/)
* [PolishAPI](https://app.swaggerhub.com/apis/ZBP/polish-api/2_1_2)
* [curl](https://github.com/curl/curl) or [curl for windows](https://curl.haxx.se/windows/)
## Getting Started
* After installing jdk 11 and Maven you should check minimal system requirements, simply run:
```
{workspace_path}>mvn --version
```
you should receive something like this:
```
Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option MaxPermSize; support was removed in 8.0
Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T20:41:47+02:00)
Maven home: D:\maven\apache-maven-3.6.0\bin\..
Java version: 11.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.2
Default locale: pl_PL, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
* Pull swagger:
```
{workspace_path}\swagger>git clone https://github.com/swagger-api/swagger-codegen.git
```
* in my case I had to modify the {workspace_path}\swagger\swagger-codegen\modules\swagger-generator\pom.xml
    file adding this dependencies:
```
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-core</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>activation</artifactId>
    <version>1.1.1</version>
</dependency>
```
* from the folder you installed swagger go to swagger-codegen folder:
{workspace_path}\swagger>cd swagger-codegen
and then build swagger codegen:
```
{workspace_path}\swagger\swagger-codegen>mvn clean package -DskipTests
```
tests fail in the swagger version I installed on my Win10pro, so I skipped them.
* Is good to know and understand all possible swagger codegen [parameters for spring](https://generator.swagger.io/api/gen/servers/spring).
* Download the ZBP-polish-api-2_1_2-swagger.json file from [PolishAPI](https://app.swaggerhub.com/apis/ZBP/polish-api/2_1_2).
* In polishAPI_Options.json file I created, I included some parameters for swagger codegen. The most important are the following:
```
{
.....
    "dateLibrary": "java8",
    "java8": "true",
    "delegatePattern": "true",
    "bigDecimalAsString": "true",
    "useTags": "true",
    "serializableModel": "true"
}
```
Unfortunately, certain Polish financial institutions opted for basic swagger default options, obtaining a lower quality solution.
* Next step is to generate the spring-boot server:
```
{workspace_path}\swagger\swagger-codegen\java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i {workspace_path}\PolishAPI_2_1_2_sample\ZBP-polish-api-2_1_2-swagger.json -l spring -o {workspace_path}\PolishAPI_2_1_2_sample\server -c {workspace_path}\PolishAPI_2_1_2_sample\polishAPI_Options.json
```
* Next, in NetBeans (or any other IDE), create a New Project/Maven/Project with Existing POM.
* Because I configured swagger-codegen with "delegatePattern": "true", after successful generation in previous step, I wrote classes that implemented AisApiDelegate, AsApiDelegate, CafApiDelegate, PisApiDelegate interfaces. In that classes I am implementing the business logic for all services.
* Start your server as an simple java application. You can view the PolishAPI documentation in swagger-ui by pointing to
https://localhost:8443/
* I opted for MongoDB as data base. To fill MongoDB with fake data you should execute the following command:
```
curl -k -X GET  https://localhost:8443/generateFakeData
```
this way, we generate RANDOM fake data. 
* To generate JWT invoke:
```
curl -k -v https://localhost:8443/jwts -H "Accept: application/json" -H "Accept-Language: en_US" -d rol=rola -d client_id=cID -d secret=abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcd -d username=user -d password=password
```
* When spring started, you can test its functionality. The best is using curl, for example:
```
curl -k -v -X POST "https://localhost:8443/v2_1_2.1/accounts/v2_1_2.1/getAccount" -H  "accept: application/json" -H  "Accept-Charset: utf-8" -H  "Accept-Encoding: gzip" -H  "Accept-Language: PL-pl" -H  "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTcyODE4NzgxLCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.ZLJBKnRrQxecJrRXLJ-etZq4g52-bxgB-JFVVPo8YwA*" -H  "X-JWS-SIGNATURE: wefewfef" -H  "X-REQUEST-ID: 95215B80-A744-11E9-B4AB-D922C8858915" -H  "Content-Type: application/json" -d "{  \"accountNumber\": \"3528-3503-4301-0498\",  \"requestHeader\": {    \"ipAddress\": \"string\",    \"isDirectPsu\": true,    \"requestId\": \"95215B80-A744-11E9-B4AB-D922C8858915\",    \"sendDate\": \"2019-10-15T20:59:12.601Z\", \"tppId\": \"string\",    \"userAgent\": \"string\", \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTcyODE4NzgxLCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.ZLJBKnRrQxecJrRXLJ-etZq4g52-bxgB-JFVVPo8YwA*\"  }}"
```
or
```
curl -k -v -X POST "https://localhost:8443/v2_1_2.1/accounts/v2_1_2.1/getAccounts" -H  "accept: application/json" -H  "Accept-Charset: utf-8" -H  "Accept-Encoding: gzip" -H  "Accept-Language: PL-pl" -H  "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTcyODE4NzgxLCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.ZLJBKnRrQxecJrRXLJ-etZq4g52-bxgB-JFVVPo8YwA*" -H  "X-JWS-SIGNATURE: wefewfef" -H  "X-REQUEST-ID: 95215B80-A744-11E9-B4AB-D922C8858915" -H  "Content-Type: application/json" -d "{ \"perPage\":\"10\", \"pageId\": \"1\",  \"requestHeader\": {    \"ipAddress\": \"string\",    \"isDirectPsu\": true,    \"requestId\": \"95215B80-A744-11E9-B4AB-D922C8858915\",    \"sendDate\": \"2019-10-15T20:59:12.601Z\", \"tppId\": \"string\",    \"userAgent\": \"string\", \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTcyODE4NzgxLCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.ZLJBKnRrQxecJrRXLJ-etZq4g52-bxgB-JFVVPo8YwA*\"  }}
```
obviously, the query predicates and the token must be in accordance with previously generated data.
## .. work in progress ...
## Authors
* **[Piotr Zerynger](p.zerynger@gmail.com)**
