package com.sakila.intro.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
    @Table(name = "country")
public class Country {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "country_id")
    private Integer id;

    @Column( name = "country")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="country")
    private List<City> cities;

    @Column(name="last_update")
    private LocalDateTime lastUpdate ;

    public Country() {
    }

    public Country(int id, String name, LocalDateTime lastUpdate) {
        this.id = id;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cities=[...]" +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
