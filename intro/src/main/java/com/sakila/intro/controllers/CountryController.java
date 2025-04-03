package com.sakila.intro.controllers;

import com.sakila.intro.entities.Country;
import com.sakila.intro.services.CountryService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    @GetMapping("/all")
        @Transactional
    public List<Country> getAllCountries(){
        return countryService.readAll();

    }

    @GetMapping("/get/{country_id}")
        @Transactional
    public Country getCountryById(@PathVariable() int country_id){
        return countryService.read(country_id);
    }



}
