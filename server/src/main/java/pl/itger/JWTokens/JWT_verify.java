package pl.itger.JWTokens;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class JWT_verify {
    /**
     * TODO: remove println, multiple returns.
     * @param token
     * @return
     */
    public ResponseEntity<String>  verify(String token) {
        String subject = "authorization failed! ";
        System.out.println(token);
        try {
            Jws<Claims> jwtClaims = Jwts
                    .parser()
                    .setSigningKey("abcd".getBytes("UTF-8"))
                    .parseClaimsJws(token.replaceAll("Bearer ", ""));
            subject = jwtClaims
                    .getBody()
                    .getSubject();
            System.out.println(subject);
        } catch (SignatureException | UnsupportedEncodingException ex) {
            subject = subject.concat(ex.getLocalizedMessage());
            Logger.getLogger(TokenProvider_controller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("GET Response : " + subject, HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>("GET Response : " + subject, HttpStatus.OK);
    }
}
