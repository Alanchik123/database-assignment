package com.example.databaseassignment.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository){
        return args -> {
                    Student alan= new Student(
                            "Alan",
                            "alan.mukeyev@nu.edu.kz",
                            LocalDate.of(2001, Month.NOVEMBER,2),
                            21
                    );

                    Student alibek=new Student(
                            "Alibek",
                            "alibek.mukeyev@nu.edu.kz",
                            LocalDate.of(1990, Month.NOVEMBER,2),
                            32
                    );

                    repository.saveAll(List.of(alan,alibek));

        };
    }
}
