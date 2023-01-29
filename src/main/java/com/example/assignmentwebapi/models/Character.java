package com.example.assignmentwebapi.models;

import com.example.assignmentwebapi.models.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Entity
@Getter @Setter @ToString
public class Character {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterId;

    @Column(nullable = false, length = 30)
    private String forName;

    @Column(nullable = false, length = 40)
    private String lastName;

    @Column(nullable = false, length = 40)
    private String alias;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column()
    private String pictureUrl;


    public Character(){};
}
