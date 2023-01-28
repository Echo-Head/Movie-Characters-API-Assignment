package com.example.assignmentwebapi.Controller.mappers;

import com.example.assignmentwebapi.Controller.dto.CharacterDTO;
import com.example.assignmentwebapi.models.Character;
import org.springframework.stereotype.Component;

@Component
public class CharacterMapper implements ICharacterMapper {



    @Override
    public CharacterDTO toCharacterDto(Character character){
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setForName(character.getForName());
        characterDTO.setLastName(character.getLastName());
        return characterDTO;
    }



    @Override
    public Character toCharacter (CharacterDTO characterDTO){
        Character character = new Character();
        character.setCharacterId(characterDTO.getCharacterId());
        character.setForName(characterDTO.getForName());
        character.setLastName(characterDTO.getLastName());
        return character;
    }

}
