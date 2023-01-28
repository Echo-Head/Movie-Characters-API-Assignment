package com.example.assignmentwebapi.service;

import com.example.assignmentwebapi.models.Character;
import com.example.assignmentwebapi.models.enums.Gender;
import com.example.assignmentwebapi.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

public CharacterService(CharacterRepository characterRepository){
    this.characterRepository = characterRepository;
}

public Character getCharacterById(long characterId){
   Optional<Character> value = characterRepository.findCharacterByCharacterId(characterId);
    return value.get();
}

public Character addCharacter(String firstName, String lastName, Gender gender, String alias, String pictureUrl){
    Character c = new Character();
    c.setForName(firstName);
    c.setLastName(lastName);
    c.setAlias(alias);
    c.setGender(gender);
    c.setPictureUrl(pictureUrl);
    return characterRepository.save(c);
}







}
