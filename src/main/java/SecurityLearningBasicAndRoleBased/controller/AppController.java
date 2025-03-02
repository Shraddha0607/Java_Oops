package SecurityLearningBasicAndRoleBased.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppController {


    @GetMapping("/getName")
    public void getName(){
        System.out.println("Controller method called");

    }

    @GetMapping("/getName1")
    public void getName1(){
        System.out.println("Controller  get name 1 method called");
    }

    @PreAuthorize("hasAuthority('ROLE_SELLER')")
    @PostMapping("/seller/saveName")
    public void saveName(@RequestParam int id){
        System.out.println("hit");
        System.out.println("Post api hit "+ id);
    }
}
