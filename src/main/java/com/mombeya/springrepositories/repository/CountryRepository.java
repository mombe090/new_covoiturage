package com.mombeya.springrepositories.repository;

import com.mombeya.springrepositories.bean.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository  extends CrudRepository<Country, Long> {
    Country findByName(String name);
    List<Country> findAllByNameLike(String string);
    List<Country> findAllByNameContains(String string);
    List<Country> findAllByPopulationLessThan(int population);
    List<Country> findAllByPopulationIsLessThan(int population);
    List<Country> findTopByIdOrderByIdDesc(int population);
}
