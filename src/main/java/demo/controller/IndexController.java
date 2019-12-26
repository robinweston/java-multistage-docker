package demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IndexController {
	
    @RequestMapping(value = "/", produces = "text/plain")
    String index(){
        return "Merry Christmas!!";
    }
}
