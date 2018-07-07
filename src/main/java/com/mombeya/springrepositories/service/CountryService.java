package com.mombeya.springrepositories.service;

import com.mombeya.springrepositories.bean.Country;
import com.mombeya.springrepositories.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService{
    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return (List<Country>) this.countryRepository.findAll();
    }

    @Override
    public Country findByName(String name) {
        return this.countryRepository.findByName(name);
    }

    @Override
    public List<Country> findAllByNameLike(String name) {
        return this.countryRepository.findAllByNameLike(name);
    }

    @Override
    public List<Country> findAllByNameContains(String string) {
        return this.countryRepository.findAllByNameContains(string);
    }

    @Override
    public List<Country> populationSup(int val) {
        return this.countryRepository.findAllByPopulationLessThan(val);
    }
}
