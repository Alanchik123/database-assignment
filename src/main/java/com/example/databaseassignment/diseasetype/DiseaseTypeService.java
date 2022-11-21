package com.example.databaseassignment.diseasetype;

import com.example.databaseassignment.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiseaseTypeService {
    List<DiseaseType> getAllDiseaseTypes();

    DiseaseType saveDiseaseType(DiseaseType diseaseType);

    DiseaseType getDiseaseTypeById(Long Id);
    DiseaseType updateDiseaseType(DiseaseType diseaseType);

    void deleteDiseaseTypeById(Long id);
}