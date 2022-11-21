package com.example.databaseassignment.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("Select s From Student s Where s.email =?1")
    Optional<Student> findStudentsByEmail(String email);
}
