package com.spring.cloud.ribbon.controler;

import com.spring.cloud.ribbon.server.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return "ribbon>>>>>>>" + helloService.hello(name);
    }
}
