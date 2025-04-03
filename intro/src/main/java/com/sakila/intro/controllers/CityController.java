package com.sakila.intro.controllers;

import com.sakila.intro.entities.City;
import com.sakila.intro.entities.Country;
import com.sakila.intro.services.CityService;
import com.sakila.intro.services.CountryService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/city")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/all")
        @Transactional
    public List<City> getAllCity(){
        return cityService.readAll();

    }




}
