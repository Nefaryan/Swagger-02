package it.develhope.Swagger02.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping(value = "/hello")

    public String welcomeApi(@RequestParam String name){
        return "Welcome!!!!! " + name;
    }

}
