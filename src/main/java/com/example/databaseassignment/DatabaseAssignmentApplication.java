package com.example.databaseassignment;


import com.example.databaseassignment.student.Student;
import com.example.databaseassignment.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class DatabaseAssignmentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseAssignmentApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
//        Student student1 =new Student("Alan","Mukeyev","alan.muekeyev@nu.edu.kz");
//        studentRepository.save(student1);
//
//        Student student2=new Student("Mirkhat","Asen","mirkhat.asen@nu.edu.kz");
//        studentRepository.save(student2);
    }
}
