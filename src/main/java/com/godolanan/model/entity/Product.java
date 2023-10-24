package com.godolanan.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "product_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;
    private String productName;
    @ManyToOne
    @JoinColumn(name = "status_code", referencedColumnName= "status_code")
    private Status statusCode;
    private Long productPrice;

    public Status getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Status statusCode) {
        this.statusCode = statusCode;
    }

}
