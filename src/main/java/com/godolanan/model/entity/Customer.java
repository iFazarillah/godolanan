package com.godolanan.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "customer_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    private String fullName;

    private String phoneNumber;

    private String address;

    private String email;


}
