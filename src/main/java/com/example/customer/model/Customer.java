package com.example.customer.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name ="customer_data")
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
