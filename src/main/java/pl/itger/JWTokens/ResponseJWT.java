package pl.itger.JWTokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class ResponseJWT implements Serializable {
    @JsonProperty
    public String scope = "Polish_API";
    @JsonProperty
    public String access_token;
    @JsonProperty
    public String token_type = "Bearer";
    @JsonProperty
    public String app_id = "APP-12345";
    @JsonProperty
    public int expires_in = 12*60*60;

}
