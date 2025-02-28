package SpringbootActuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainActuator {
    public static void main(String[] args){
        SpringApplication.run(MainActuator.class, args);
    }
}


// http://localhost:8080/actuator
// from this  endpoint, we check and monitor our application

// steps to implement actuator
// 1) add dependency in pom.xml
// 2) add in application.xml
// then from above link can check details and internal
// also can create own endpoint
// here not working, but this is the way
