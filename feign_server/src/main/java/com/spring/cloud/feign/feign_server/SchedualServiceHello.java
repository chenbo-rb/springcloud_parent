package com.spring.cloud.feign.feign_server;


import com.spring.cloud.feign.feign_server.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-eureka",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "/home")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
