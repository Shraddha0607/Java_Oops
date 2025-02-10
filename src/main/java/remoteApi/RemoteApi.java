package remoteApi;

import com.javaCore.coreJava.CoreJavaApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RemoteApi {
    public static void main(String[] args) {

        SpringApplication.run(RemoteApi.class, args);
        System.out.println("Welcome, great victory");

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        System.out.println("Rest Template called");
        return builder.build();
    }
//
//    @Bean
//    @Profile("!test")
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Quote quote = restTemplate.getForObject(
//                    "http://localhost:8080/api/random", Quote.class);
//            log.info(quote.toString());
//        };
//    }
}
