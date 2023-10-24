package com.godolanan.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
public class ProductDetails {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    private String productTypeCode;

    private LocalDate dateReleased;

    private String artist;

    private String company;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;


}
