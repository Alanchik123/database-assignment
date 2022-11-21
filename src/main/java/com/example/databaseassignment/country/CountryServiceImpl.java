package com.example.databaseassignment.country;

import com.example.databaseassignment.diseasetype.DiseaseType;
import com.example.databaseassignment.diseasetype.DiseaseTypeRepository;
import com.example.databaseassignment.student.Student;
import com.example.databaseassignment.student.StudentRepository;
import com.example.databaseassignment.student.StudentService;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Service

public class CountryServiceImpl implements CountryService{


    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country getCountryById(String disease_code) {
        return countryRepository.findById(disease_code).get();
    }

    @Override
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountryById(String disease_code) {
        countryRepository.deleteById(disease_code);

    }
}
