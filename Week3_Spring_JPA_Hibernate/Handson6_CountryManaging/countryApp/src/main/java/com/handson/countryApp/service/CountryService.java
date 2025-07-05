package com.handson.countryApp.service;

import com.handson.countryApp.model.Country;
import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findByCode(String code);
    Country addCountry(Country country);
    Country updateCountry(Country country);
    void deleteCountry(String code);
    List<Country> searchCountriesByName(String namePart);
}
