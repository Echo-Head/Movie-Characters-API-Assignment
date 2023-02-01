package com.example.assignmentwebapi.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, length = 420)
    private String genre;
    private int releaseYear;
    private String director;
    private String picture;
    private String trailer;

    @ManyToMany
    @JoinTable(
            name = "character_movies",
            joinColumns = { @JoinColumn(name = "movie_id") },
            inverseJoinColumns = { @JoinColumn(name = "character_id") }
    )
    private Set<Character> characters;
    @ManyToOne
    @JoinColumn(name="franchise_id")
    private Franchise franchise;
}
