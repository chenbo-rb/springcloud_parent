package com.spring.cloud.config.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${foo}")
    private String foo;
    @Value("${serviceCode}")
    private String serviceCode;

    @RequestMapping("hello")
    public String hello(){
        return "serviceCode:"+serviceCode+"\n\tfoo:"+foo;
    }
}
