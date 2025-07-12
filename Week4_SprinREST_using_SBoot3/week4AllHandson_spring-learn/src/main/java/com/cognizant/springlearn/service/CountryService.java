package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.model.Countries;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;

@Service  // Marks this as a service class for Spring to manage
public class CountryService {

    // This method fetches a country based on its code
    public Country getCountry(String code) throws Exception {
        // Load the XML file as an InputStream
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("country.xml");

        // Set up JAXB (Java Architecture for XML Binding) to read the XML
        JAXBContext context = JAXBContext.newInstance(Countries.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // Unmarshal (convert XML into a Java object)
        Countries countries = (Countries) unmarshaller.unmarshal(inputStream);

        List<Country> countryList = countries.getCountryList();

        // Search and return the country with the matching code (case-insensitive)
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))  // Case-insensitive comparison
                .findFirst()
                .orElseThrow(() -> new Exception("Country not found"));
    }
}
