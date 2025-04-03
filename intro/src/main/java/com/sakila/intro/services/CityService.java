package com.sakila.intro.services;

import com.sakila.intro.entities.City;

import java.util.List;

public interface CityService extends IService<City, Integer> {
    List<City> searchByName(String name);
}