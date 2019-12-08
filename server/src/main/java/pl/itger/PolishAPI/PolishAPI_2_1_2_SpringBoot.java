package pl.itger.PolishAPI;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.itger.dataFaker", "pl.itger.JWTokens", "pl.itger.PolishAPI"})
@EnableSwagger2
public class PolishAPI_2_1_2_SpringBoot { //implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplication(PolishAPI_2_1_2_SpringBoot.class).run(args);
    }

    /*@Override
    public void run(@NotNull String... arg0) {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }*/

    class ExitException
            extends RuntimeException
            implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }
    }
}
