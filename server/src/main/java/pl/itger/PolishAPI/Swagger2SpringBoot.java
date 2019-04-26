package pl.itger.PolishAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.itger.PolishAPI.repository.AccountInfoRepository;
import pl.itger.PolishAPI.repository.HoldInfoRepository;
import pl.itger.PolishAPI.repository.TransactionInfoRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableMongoRepositories(
//            basePackageClasses = {AccountInfoRepository.class, HoldInfoRepository.class, TransactionInfoRepository.class})
@SpringBootApplication
@EnableSwagger2
@ComponentScan(
        basePackages = {"pl.itger.PolishAPI",
            "pl.itger.PolishAPI.implementation", "pl.itger.PolishAPI.io.swagger.api", "pl.itger.PolishAPI.io.swagger.configuration"}
)
public class Swagger2SpringBoot
        implements CommandLineRunner {

@Override
public void run(String... arg0) throws Exception {
    if (arg0.length > 0 && arg0[0].equals("exitcode")) {
        throw new ExitException();
    }
}

public static void main(String[] args) throws Exception {
    //FakeDataGen.makeData();
    new SpringApplication(Swagger2SpringBoot.class).run(args);
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
