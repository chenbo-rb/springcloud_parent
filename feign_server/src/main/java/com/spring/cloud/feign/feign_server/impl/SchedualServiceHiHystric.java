package com.spring.cloud.feign.feign_server.impl;

import com.spring.cloud.feign.feign_server.SchedualServiceHello;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiHystric implements SchedualServiceHello {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
