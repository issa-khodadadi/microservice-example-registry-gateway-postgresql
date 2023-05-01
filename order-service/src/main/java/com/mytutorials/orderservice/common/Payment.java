package com.mytutorials.orderservice.common;

import lombok.*;

import javax.persistence.*;

/**
 * Created on 4/30/2023 17:47:44,
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentStatus;
    private String transactionId;

    private Long orderId;
    private double amount;
}
