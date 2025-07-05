package com.handson.querydemo.repo;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.handson.querydemo.model.Country;

public interface CountryRepo extends JpaRepository<Country, String> {

    List<Country> findByCoNameContaining(String name);
    List<Country> findAllByOrderByCoNameAsc();
    List<Country> findByCoNameStartingWith(String prefix);
    List<Country> findByIndependenceDateBetween(Date start, Date end);
    List<Country> findByPopulationGreaterThan(int value);
    List<Country> findTop5ByOrderByPopulationAsc();
}
