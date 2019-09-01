package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    ExchangeValueRepository exchangeValueRepository;


    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retriveExchangeValue(
            @PathVariable String from,
            @PathVariable String to)
    {

        ExchangeValue value = exchangeValueRepository.findByFromAndTo(from, to);
        value.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
        return value;
    }
}
