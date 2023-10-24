package com.godolanan.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "order_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    private Long totalOrder;

    @JoinColumn(name = "status_code", referencedColumnName= "status_code")
    private Status status;
    private boolean isCompleted;
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime completedAt;

    private String createdBy;

    private String updatedBy;

}
