package com.example.databaseassignment.student;
import com.example.databaseassignment.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long Id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
