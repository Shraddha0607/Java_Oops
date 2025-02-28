package FrontendImplementation;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Controller {

    @GetMapping("{id}")
    public Student getStudent(@PathVariable int id){
        Student student = new Student(1, "Sid");
        return student;
    }
}
