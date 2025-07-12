package com.cognizant.springlearn.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "countries")  // Marks this as a wrapper for multiple countries
public class Countries {
    private List<Country> countryList;

    @XmlElement(name = "country")
    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}
