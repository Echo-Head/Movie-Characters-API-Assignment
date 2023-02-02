package com.example.assignmentwebapi.controllers;

import com.example.assignmentwebapi.mappers.CharacterMapper;
import com.example.assignmentwebapi.models.dtos.character.CharacterDTO;
import com.example.assignmentwebapi.services.character.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/character")
public class CharacterController {


public CharacterController(CharacterMapper characterMapper, CharacterService characterService){
    this.characterMapper = characterMapper;
    this.characterService = characterService;
}

private final CharacterMapper characterMapper;
private final CharacterService characterService;

}
