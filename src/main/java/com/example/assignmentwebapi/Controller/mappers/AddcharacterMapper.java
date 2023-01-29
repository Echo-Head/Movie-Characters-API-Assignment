package com.example.assignmentwebapi.Controller.mappers;
import com.example.assignmentwebapi.models.Character;
import com.example.assignmentwebapi.Controller.dto.AddCharacterDTO;
import org.springframework.stereotype.Component;

@Component
public class AddcharacterMapper implements IAddCharacterMapper{

    @Override
    public AddCharacterDTO toAddCharacterDTO(Character character){
        AddCharacterDTO addCharacterDTO = new AddCharacterDTO();
        addCharacterDTO.setForName(character.getForName());
        addCharacterDTO.setLastName(character.getLastName());
        return addCharacterDTO;
    }

    @Override
    public Character toAddCharacter(AddCharacterDTO addCharacterDTO){
        Character character = new Character();
        character.setForName(addCharacterDTO.getForName());
        character.setLastName(addCharacterDTO.getLastName());
        return character;
    }

}
