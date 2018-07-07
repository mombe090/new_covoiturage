package com.mombeya.springrepositories.controller;

import com.mombeya.springrepositories.bean.Country;
import com.mombeya.springrepositories.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {
    @Autowired
    ICountryService countryService;

    @GetMapping
    public List<Country> index() {
        return this.countryService.findAll();
    }

    @GetMapping(value = "{name}")
    public Country country(@PathVariable String name)  {
        return this.countryService.findByName(name);
    }

    @GetMapping(value = "/all/{name}")
    public List<Country> countries(@PathVariable int name) {
        return  this.countryService.populationSup(name);
    }
}
