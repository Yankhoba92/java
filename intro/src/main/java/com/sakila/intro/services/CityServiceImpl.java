package com.sakila.intro.services;

import com.sakila.intro.entities.City;
import com.sakila.intro.repositories.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private static final Logger log = LoggerFactory.getLogger(CityServiceImpl.class);

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City create(City city) {
        return null;
    }

    @Override
    public City read(Integer id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<City> readAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> searchByName(String search) {
        return cityRepository.findCitiesByNameContains(search);
    }
}
