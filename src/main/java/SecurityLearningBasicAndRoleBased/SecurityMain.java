package SecurityLearningBasicAndRoleBased;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecurityMain {
    public static void main(String[] args){
        ConfigurableApplicationContext context =  SpringApplication.run(SecurityMain.class, args);
        System.out.println("Its is runing");
        System.out.println(" context vlaue " + context.toString() );
    }
}

// http://localhost:8080/swagger-ui.html --swagger url