package com.example.demo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Profile {

    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;
}
