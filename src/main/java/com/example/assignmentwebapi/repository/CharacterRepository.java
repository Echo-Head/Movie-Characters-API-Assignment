package com.example.assignmentwebapi.repository;

import com.example.assignmentwebapi.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

Optional<Character> findCharacterByCharacterId(int characterId);




}
