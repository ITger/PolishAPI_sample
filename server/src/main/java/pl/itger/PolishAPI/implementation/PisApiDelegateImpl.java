/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.itger.PolishAPI.io.swagger.api.PisApiDelegate;
import pl.itger.PolishAPI.io.swagger.model.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
public class PisApiDelegateImpl implements PisApiDelegate {

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return PisApiDelegate.super.getObjectMapper(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return PisApiDelegate.super.getRequest(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return PisApiDelegate.super.getAcceptHeader(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<PaymentsBundleResponse> bundle(String authorization,
                                                         String acceptEncoding,
                                                         String acceptLanguage,
                                                         String acceptCharset,
                                                         String X_JWS_SIGNATURE,
                                                         String X_REQUEST_ID,
                                                         PaymentsBundleRequest bundleRequest) {
        return PisApiDelegate.super.bundle(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                bundleRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<CancelPaymentsResponse> cancelPayments(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            CancelPaymentsRequest paymentData) {
        return PisApiDelegate.super.cancelPayments(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                paymentData); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<CancelRecurringPaymentResponse> cancelRecurringPayment(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            CancelRecurringPaymentRequest recurringPaymentData) {
        return PisApiDelegate.super.cancelRecurringPayment(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                recurringPaymentData); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<AddPaymentResponse> domestic(String authorization,
                                                       String acceptEncoding,
                                                       String acceptLanguage,
                                                       String acceptCharset,
                                                       String X_JWS_SIGNATURE,
                                                       String X_REQUEST_ID,
                                                       PaymentDomesticRequest domesticRequest) {
        return PisApiDelegate.super.domestic(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                domesticRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<AddPaymentResponse> eEA(String authorization,
                                                  String acceptEncoding,
                                                  String acceptLanguage,
                                                  String acceptCharset,
                                                  String X_JWS_SIGNATURE,
                                                  String X_REQUEST_ID,
                                                  PaymentEEARequest eeARequest) {
        return PisApiDelegate.super.eEA(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                eeARequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<BundleResponse> getBundle(String authorization,
                                                    String acceptEncoding,
                                                    String acceptLanguage,
                                                    String acceptCharset,
                                                    String X_JWS_SIGNATURE,
                                                    String X_REQUEST_ID,
                                                    BundleRequest bundle) {
        return PisApiDelegate.super.getBundle(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                bundle); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<PaymentsResponse> getMultiplePayments(
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            PaymentsRequest payments) {
        return PisApiDelegate.super.getMultiplePayments(acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                payments); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<GetPaymentResponse> getPayment(String authorization,
                                                         String acceptEncoding,
                                                         String acceptLanguage,
                                                         String acceptCharset,
                                                         String X_JWS_SIGNATURE,
                                                         String X_REQUEST_ID,
                                                         PaymentRequest payment) {
        return PisApiDelegate.super.getPayment(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                payment); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<RecurringPaymentStatusResponse> getRecurringPayment(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            RecurringPaymentStatusRequest recurringPayment) {
        return PisApiDelegate.super.getRecurringPayment(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                recurringPayment); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<AddPaymentResponse> nonEEA(String authorization,
                                                     String acceptEncoding,
                                                     String acceptLanguage,
                                                     String acceptCharset,
                                                     String X_JWS_SIGNATURE,
                                                     String X_REQUEST_ID,
                                                     PaymentNonEEARequest nonEEARequest) {
        return PisApiDelegate.super.nonEEA(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                nonEEARequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<RecurringPaymentResponse> recurring(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            RecurringPaymentRequest recurringRequest) {
        return PisApiDelegate.super.recurring(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                recurringRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<AddPaymentResponse> tax(String authorization,
                                                  String acceptEncoding,
                                                  String acceptLanguage,
                                                  String acceptCharset,
                                                  String X_JWS_SIGNATURE,
                                                  String X_REQUEST_ID,
                                                  PaymentTaxRequest taxRequest) {
        return PisApiDelegate.super.tax(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                taxRequest); //To change body of generated methods, choose Tools | Templates.
    }

}
