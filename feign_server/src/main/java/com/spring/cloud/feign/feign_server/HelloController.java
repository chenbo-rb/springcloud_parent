package com.spring.cloud.feign.feign_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello schedualServiceHello;
    @RequestMapping(value = "/hello")
    public String sayHi(@RequestParam String name){
        String str = schedualServiceHello.sayHiFromClientOne(name);
        return "feign>>>>>>"+str;
    }
}
