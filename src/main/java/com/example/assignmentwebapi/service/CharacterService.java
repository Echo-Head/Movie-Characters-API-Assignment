package com.example.assignmentwebapi.service;

import com.example.assignmentwebapi.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

public CharacterService(CharacterRepository characterRepository){
    this.characterRepository = characterRepository;
}









}
