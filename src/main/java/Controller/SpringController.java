package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/hello")
    public String hello()
    {
            return "Hello and welcome! to my Application";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name)
    {
        return "Hello mr"+ name+ "and welcome! to my Application";
    }
}
