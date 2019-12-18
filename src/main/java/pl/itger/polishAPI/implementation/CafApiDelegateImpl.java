/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.polishAPI.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.itger.polishAPI.io.swagger.api.CafApiDelegate;
import pl.itger.polishAPI.io.swagger.model.ConfirmationOfFundsRequest;
import pl.itger.polishAPI.io.swagger.model.ConfirmationOfFundsResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
public class CafApiDelegateImpl implements CafApiDelegate {

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return CafApiDelegate.super.getObjectMapper(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return CafApiDelegate.super.getRequest(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return CafApiDelegate.super.getAcceptHeader(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<ConfirmationOfFundsResponse> getConfirmationOfFunds(
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            ConfirmationOfFundsRequest confirmationOfFundsRequest) {
        return CafApiDelegate.super.getConfirmationOfFunds(acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                confirmationOfFundsRequest); //To change body of generated methods, choose Tools | Templates.
    }

}
