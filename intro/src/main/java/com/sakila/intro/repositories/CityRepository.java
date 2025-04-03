package com.sakila.intro.repositories;

import com.sakila.intro.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {
    List<City> findCitiesByNameContains(String name);
}
