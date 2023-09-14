package com.example.demo.entity;

import com.example.demo.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

@Table(name = "users")
@Entity
@Accessors(chain = true)
@Data
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password; // password is hash
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
