package com.cgi.demo.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;

@Component
public class CountryRepository {
 
    private static final Map<String, Country> countries = new HashMap<>();
 
    @PostConstruct
    public void initData() {
    	Country country = new Country();
    	country.setCapital("Madrid");
    	country.setCurrency(Currency.EUR);
    	country.setName("Spain");
    	country.setPopulation(47000000);
    	countries.put("Spain", country);
    }
 
    public Country findCountry(String name) {
        return countries.get(name);
    }
}
