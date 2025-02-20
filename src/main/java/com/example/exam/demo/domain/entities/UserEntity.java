package com.example.exam.demo.domain.entities;


import com.example.exam.demo.domain.enums.UserRole;
import jakarta.persistence.*;

@Entity(name="users")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
