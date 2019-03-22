/*
 * Copyright (C) 2019 Piotr Zerynger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.itger.PolishAPI.implementation;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component("tokenUtils")
public class TokenUtils {

boolean
        verify(String token) {
    String subject = "Something very bad! ";
    System.out.println(token);
    try {
        Jws<Claims> jwtClaims = Jwts
                .parser().
                setSigningKey("secretPassword".getBytes("UTF-8")).
                parseClaimsJws(token);
        subject = jwtClaims
                .getBody().
                getSubject();
        //System.out.println(subject);
    } catch (ExpiredJwtException ex) {
        //subject = subject.concat(ex.getLocalizedMessage());
        Logger.getLogger(TokenUtils.class.getName()).
                log(Level.SEVERE,
                    null,
                    ex);
        return Boolean.FALSE;
    } catch (MalformedJwtException ex) {
        //subject = subject.concat(ex.getLocalizedMessage());
        Logger.getLogger(TokenUtils.class.getName()).
                log(Level.SEVERE,
                    null,
                    ex);
        return Boolean.FALSE;
    } catch (io.jsonwebtoken.SignatureException ex) {
        //subject = subject.concat(ex.getLocalizedMessage());
        Logger.getLogger(TokenUtils.class.getName()).
                log(Level.SEVERE,
                    null,
                    ex);
        return Boolean.FALSE;
    } catch (UnsupportedJwtException ex) {
        //subject = subject.concat(ex.getLocalizedMessage());
        Logger.getLogger(TokenUtils.class.getName()).
                log(Level.SEVERE,
                    null,
                    ex);
        return Boolean.FALSE;
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(TokenUtils.class.getName()).
                log(Level.SEVERE,
                    null,
                    ex);
    }
    return Boolean.TRUE;
}

boolean verify(String authorization,
        String token) {
    return (authorization != null 
            && authorization.startsWith("Bearer ")
            && authorization.substring(7).equals(token)
            && verify(authorization.substring(7))
            && verify(token));
}
}
