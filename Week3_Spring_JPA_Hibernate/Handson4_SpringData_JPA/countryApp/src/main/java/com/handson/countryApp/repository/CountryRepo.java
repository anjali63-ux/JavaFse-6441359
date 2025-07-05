package com.handson.countryApp.repository;

import com.handson.countryapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepo extends JpaRepository<Country, String> {
    List<Country> findByCoNameContainingIgnoreCase(String namePart);
}
