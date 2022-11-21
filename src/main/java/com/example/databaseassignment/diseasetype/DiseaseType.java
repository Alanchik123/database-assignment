package com.example.databaseassignment.diseasetype;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDate;

import javax.persistence.*;
@Entity
@Table

public class DiseaseType {
    @Id
    @SequenceGenerator(
            name="diseaseType_sequence",
            sequenceName="diseaseType_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "diseaseType_sequence"
    )
    private Long id;

    private String cname;

    public DiseaseType() {
    }

    public DiseaseType(Long id, String cname) {
        this.id = id;
        this.cname = cname;
    }

    public DiseaseType(String cname) {
        this.cname = cname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "DiseaseType{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                '}';
    }
}
