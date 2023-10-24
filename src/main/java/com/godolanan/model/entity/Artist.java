package com.godolanan.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
public class Artist {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    private String name;

    private LocalDate debutDate;

    private LocalDate retirementDate;

    @ManyToOne
    @JoinColumn(name = "status_code", referencedColumnName= "status_code")
    private Status statusCode;

    public Status getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Status statusCode) {
        this.statusCode = statusCode;
    }

}
