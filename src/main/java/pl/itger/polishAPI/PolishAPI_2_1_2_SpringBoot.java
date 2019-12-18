package pl.itger.polishAPI;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@ComponentScan(basePackages = {"pl.itger.dataFaker", "pl.itger.JWTokens", "pl.itger.polishAPI"})
@EnableSwagger2
public class PolishAPI_2_1_2_SpringBoot{// implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("PolishAPI_2_1_2_SpringBoot XXXXXXXXXXXXXXXXXXXXXXXX");
        SpringApplication.run(PolishAPI_2_1_2_SpringBoot.class, args);
    }

//    @Override
//    public void run(@NotNull String... arg0) {
//        System.out.println("runs XXXXXXXXXXXXXXXXXXXXXXXX");
//        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
//            throw new ExitException(-1);
//        }
//
//        //CodecProvider pojoCodecProvider = PojoCodecProvider.builder().register("pl.itger.polishAPI.io.swagger.model").build();
//        //CodecRegistry pojoCodecRegistry = fromRegistries( fromProviders(pojoCodecProvider));
//    }

//    class ExitException
//            extends RuntimeException
//            implements ExitCodeGenerator {
//        private static final long serialVersionUID = 1L;
//
//        @Override
//        public int getExitCode() {
//            return 10;
//        }
//    }
}
