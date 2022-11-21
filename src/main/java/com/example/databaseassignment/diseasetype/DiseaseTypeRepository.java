package com.example.databaseassignment.diseasetype;

import com.example.databaseassignment.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseTypeRepository extends JpaRepository<DiseaseType,Long> {
}
