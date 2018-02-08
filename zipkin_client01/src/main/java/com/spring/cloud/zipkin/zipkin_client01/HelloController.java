package com.spring.cloud.zipkin.zipkin_client01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class HelloController {

    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hello")
    public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }


    @RequestMapping("/miya")
    public String callHome(){
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8987/miya",String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-miya ");

        return "i'm service-miya";

    }

}
