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
package pl.itger.JWTokens;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.time.DateUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * curl -k -v https://localhost:8080/jwts -H "Accept: application/json" -H "Accept-Language: en_US" -d client_id=cID -d secret=abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcd -d username=user -d password=password
 */
@RestController
@RequestMapping("/")
public class TokenProvider_controller {
    @Autowired
    ResponseJWT respJWT;

    @RequestMapping(value = "jwts", method = RequestMethod.POST)
    @ResponseBody
    public String get(@NotNull String client_id, @NotNull String secret, Authentication authentication) {
        Date expirationDate = DateUtils.addDays(new Date(), 90);
        String jwt = "Jwts.builder FAILED";
        //User user = ((User) authentication.getPrincipal());
//        List<String> roles = user.getAuthorities()
//                .stream()
//                .map(GrantedAuthority::getAuthority)
//                .collect(Collectors.toList());
        List<String> roles = Arrays.asList("Rol1", "Rol2");
        try {
            jwt = Jwts.builder()
                    .setIssuer("http://itger.pl/")
                    .setSubject("subject")
                    .setAudience("audience")
                    .setExpiration(expirationDate)
                    .claim("rol", roles)
                    .claim("name", "client_id")
                    .claim("scope", "itger_polishAPI_2_1_2")
                    .signWith(
                            SignatureAlgorithm.HS256,
                            secret.getBytes(StandardCharsets.UTF_8)
                    )
                    .compact();
        } catch (Exception ex) {
            Logger.getLogger(TokenProvider_controller.class.getName())
                    .log(Level.SEVERE,ex.getMessage(),  ex);
            return jwt;
        }
        respJWT.access_token = jwt;
        return jwt;
    }
}
