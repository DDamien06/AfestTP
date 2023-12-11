package com.example.AfestTP.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long clientId;

    @Column(nullable = false, name="first_name")
    private String clientFirstName;

    @Column(nullable = false, name="last_name")
    private String clientLastName;

    @Column(nullable = false, name="mail")
    private String clientMail;


}
