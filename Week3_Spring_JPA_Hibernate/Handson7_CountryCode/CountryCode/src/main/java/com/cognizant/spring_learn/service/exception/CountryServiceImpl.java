package com.cognizant.spring_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.repository.CountryRepository;

import jakarta.transaction.Transactional;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Existing method
    @Override
    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundExcep {
        Optional<Country> result = countryRepository.findById(code);
        if (!result.isPresent()) {
            throw new CountryNotFoundExcep("Country not found");
        }
        return result.get();
    }

    // 🔽 ADD HERE (below the findCountryByCode method)
    @Override
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

}

