package com.sakila.intro.services;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryImplTest {

    private static final Logger log = LoggerFactory.getLogger(CountryImplTest.class);

    @Autowired
    CountryService service;

    @BeforeEach
    void setUp() {
        log.info("--------------------Check Service Injection--------------------");
        assertNotNull(service,"Service Country NOT Injected !!");
        log.info("Service Injection Ok : {}\n", (service != null));
    }

    @Test
        @Transactional
    void read(){
        log.info("--------------------<read START--------------------");
        var countryId = 23;
        var country = service.read(countryId);
        log.trace("{}", country);
        var cities = country.getCities();
        for (var city : cities) {
            log.trace("{}", city);
        }
        log.info("=========================");
        log.info("Nbre total cities : {}", cities.size());
        log.info("--------------------read   STOP --------------------");
    }
    @Test
    void readAll() {
        log.info("--------------------readAll START--------------------");
        var countries = service.readAll();
        countries.forEach(c->log.trace("{}",c));
        log.info("Nbre de pays : {}",countries.size()   );
        log.info("--------------------readAll STOP --------------------");
    }
}