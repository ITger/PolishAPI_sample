package pl.itger.polishAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.itger.dataFaker", "pl.itger.JWTokens", "pl.itger.polishAPI"})
@EnableSwagger2
public class PolishAPI_SpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(PolishAPI_SpringBoot.class, args);
    }

}
