package com.sakila.intro.services;

import com.sakila.intro.entities.Country;
import com.sakila.intro.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }


    @Override
    public Country create(Country obj) {
        return null;
    }

    @Override
    public Country read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Country update(Country obj) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Country> readAll() {
        return repository.findAll();
    }
}
