package SpringbootActuator.controller;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/api")
    public String getCustom(){
        System.out.println("Hitt");
        return "this is custom endpoint";
    }
}
