package SpringbootActuator.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="custom")
public class CustomEndpoint {

    @ReadOperation
    public String getCustom(){
        System.out.println("Hitt");
        return "this is custom endpoint";
    }

}


