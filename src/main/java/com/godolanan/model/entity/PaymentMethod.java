package com.godolanan.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class PaymentMethod {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "payment_method_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;


}
