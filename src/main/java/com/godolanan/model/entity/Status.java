package com.godolanan.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Status {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "status_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    @Column(name = "status_code",length = 10,nullable = false,columnDefinition = "varchar(10)")
    private String statusCode;

    private String status;

    private String description;
}
