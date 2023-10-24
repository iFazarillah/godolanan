package com.godolanan.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "order_details_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    @OneToOne
    @JoinColumn(name = "order_order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Long quantity;

    private Long totalPrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
