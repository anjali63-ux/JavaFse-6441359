package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundExcep;
import java.util.Optional;

public interface CountryService {
    Country findCountryByCode(String code) throws CountryNotFoundExcep;
}

@Transactional
void addCountry(Country country);

