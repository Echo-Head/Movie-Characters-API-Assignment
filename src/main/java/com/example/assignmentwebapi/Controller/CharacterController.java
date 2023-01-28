package com.example.assignmentwebapi.Controller;

import com.example.assignmentwebapi.Controller.dto.CharacterDTO;
import com.example.assignmentwebapi.Controller.mappers.CharacterMapper;
import com.example.assignmentwebapi.service.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/vi/character")
public class CharacterController {


public CharacterController(CharacterMapper characterMapper, CharacterService characterService){
    this.characterMapper = characterMapper;
    this.characterService = characterService;
}

private final CharacterMapper characterMapper;
private final CharacterService characterService;



@GetMapping("/get/{id}")
public ResponseEntity getCharacterById(@PathVariable(value = "id") long characterId){
    System.out.println("get funtion first line");
    CharacterDTO characterDTO = characterMapper.toCharacterDto(characterService.getCharacterById(characterId));
    return ResponseEntity.ok(characterDTO);
}





}
