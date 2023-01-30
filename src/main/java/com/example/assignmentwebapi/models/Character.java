package com.example.assignmentwebapi.models;

import com.example.assignmentwebapi.models.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter @Setter @ToString
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private int id;

    @Column(nullable = false, length = 60)
    private String fullName;

    @Column(nullable = false, length = 40)
    private String alias;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column()
    private String pictureUrl;

    public Character(){};

    @ManyToMany(mappedBy = "characters")
    private Set<Movie> movies;
}
