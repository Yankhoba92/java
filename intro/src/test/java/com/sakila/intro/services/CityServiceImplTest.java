package com.sakila.intro.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityServiceImplTest {

    private static final Logger log = LoggerFactory.getLogger(CityServiceImplTest.class);

    @Autowired
    CityServiceImpl cityService;

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Search By Name")
    void searchByName() {
        log.info("--------------------<<START searchByName -------------------->>");
        readLike("Pa");
        readLike("Xi");
        log.info("--------------------<<END   searchByName -------------------->>");
    }

    private void readLike(String str) {
        var cities = cityService.searchByName(str);
        cities.forEach(c->log.trace("{}", c));
        log.info("Nbre de villes trouvées avec ({}) : {}",str, cities.size());
    }

    @Test
    void read() {
        log.info("--------------------read by Id START--------------------");
        var city = cityService.read(59);
        log.trace("{}", city);
        log.info("--------------------read by Id END --------------------");
    }

    @Test
    void readAll() {
        log.info("--------------------readAll START--------------------");
        var cities = cityService.readAll();
        cities.forEach(c->log.trace("{}", c));
        log.info("Nbre de cities : {}"
                , cities.size() );
        assertEquals(600, cities.size(),0,"Nbre de cities ERRONE : " + cities.size());
        log.info("--------------------readAll END--------------------");
    }
}