package com.example.assignmentwebapi.models;

import com.example.assignmentwebapi.models.enums.Gender;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterId;

    @Column(nullable = false, length = 30)
    private String forName;

    @Column(nullable = false, length = 40)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;


}
