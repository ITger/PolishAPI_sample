package pl.itger.PolishAPI;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableMongoRepositories(
//            basePackageClasses = {AccountInfoRepository.class, HoldInfoRepository.class, TransactionInfoRepository.class})

@SpringBootApplication
@ComponentScan(basePackages = {"pl.itger.dataFaker", "pl.itger.PolishAPI"})
@EnableSwagger2
public class Swagger2SpringBoot implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    @Override
    public void run(@NotNull String... arg0) {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

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
