package io.learning.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
     /* Method in this class maps to URL request*/

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }

}
