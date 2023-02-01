package com.example.assignmentwebapi.services.character;

import com.example.assignmentwebapi.models.Character;
import com.example.assignmentwebapi.models.enums.Gender;
import com.example.assignmentwebapi.repositories.CharacterRepository;
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

public Character addCharacter(String fullName, String alias, Gender gender,  String pictureUrl){
    Character c = new Character();
    c.setFullName(fullName);
    c.setAlias(alias);
    c.setAlias(alias);
    c.setGender(gender);
    c.setPictureUrl(pictureUrl);
    return characterRepository.save(c);
}







}
