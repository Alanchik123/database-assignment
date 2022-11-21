package com.example.databaseassignment.disease;


import com.example.databaseassignment.country.Country;
import com.example.databaseassignment.country.CountryRepository;
import com.example.databaseassignment.diseasetype.DiseaseType;
import com.example.databaseassignment.diseasetype.DiseaseTypeRepository;
import com.example.databaseassignment.student.Student;
import com.example.databaseassignment.student.StudentRepository;
import com.example.databaseassignment.student.StudentService;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Service

public class DiseaseServiceImpl implements DiseaseService{
    private DiseaseRepository diseaseRepository;

    public DiseaseServiceImpl(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    @Override
    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    @Override
    public Disease saveDisease(Disease disease) {
        return diseaseRepository.save(disease);
    }

    @Override
    public Disease getDiseaseById(String cname) {
        return diseaseRepository.findById(cname).get();
    }

    @Override
    public Disease updateDisease(Disease disease) {
        return diseaseRepository.save(disease);
    }

    @Override
    public void deleteDiseaseById(String cname) {
        diseaseRepository.deleteById(cname);

    }
}

