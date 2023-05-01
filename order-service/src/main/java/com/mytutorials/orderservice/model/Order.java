package com.mytutorials.orderservice.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created on 4/30/2023 15:28:38,
 */
@Entity
@Table(name = "t_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int qty;
    private double price;
}
