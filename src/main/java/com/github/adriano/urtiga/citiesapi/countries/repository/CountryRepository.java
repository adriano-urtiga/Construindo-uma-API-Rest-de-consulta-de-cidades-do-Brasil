package com.github.adriano.urtiga.citiesapi.countries.repository;

import com.github.adriano.urtiga.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
