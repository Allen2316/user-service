package com.allen.user.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String userName;
    private String password;
}
