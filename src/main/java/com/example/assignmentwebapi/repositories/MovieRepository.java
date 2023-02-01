package com.example.assignmentwebapi.repositories;

import com.example.assignmentwebapi.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
