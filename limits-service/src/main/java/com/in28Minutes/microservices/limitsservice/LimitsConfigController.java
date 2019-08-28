package com.in28Minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfig() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
