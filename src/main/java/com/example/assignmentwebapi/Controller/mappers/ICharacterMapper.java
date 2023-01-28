package com.example.assignmentwebapi.Controller.mappers;

import com.example.assignmentwebapi.Controller.dto.CharacterDTO;
import com.example.assignmentwebapi.models.Character;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface ICharacterMapper {
    public CharacterDTO toCharacterDto(Character character);
    public Character toCharacter (CharacterDTO characterDTO);

}
