package com.example.databaseassignment.disease;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDate;

import javax.persistence.*;
@Entity
@Table

public class Disease {

    @Id
    private String diseaseCode;

    private String pathogen;

    private String description;

    private Long id;

    public Disease() {
    }

    public Disease(String diseaseCode, String pathogen, String description, Long id) {
        this.diseaseCode = diseaseCode;
        this.pathogen = pathogen;
        this.description = description;
        this.id = id;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getPathogen() {
        return pathogen;
    }

    public void setPathogen(String pathogen) {
        this.pathogen = pathogen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
