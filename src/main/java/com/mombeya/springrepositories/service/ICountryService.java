package com.mombeya.springrepositories.service;

import com.mombeya.springrepositories.bean.Country;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();
    Country findByName(String name);
    List<Country> findAllByNameLike(String name);
    List<Country> findAllByNameContains(String string);
    List<Country> populationSup(int val);
}
