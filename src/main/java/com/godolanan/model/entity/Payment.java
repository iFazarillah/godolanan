package com.godolanan.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Payment {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "payment_id",length = 36,nullable = false,columnDefinition = "varchar(36)")
    private String id;

    @OneToOne
    @JoinColumn(name = "order_order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "payment_method_payment_method_id")
    private PaymentMethod paymentMethod;

    private String accountName;

    private String accountNumber;

    private String proofUrl;

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


}
