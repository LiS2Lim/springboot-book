package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TestEntity {

    @Id
    private String userid;

    private String password;

    private String email;
}
