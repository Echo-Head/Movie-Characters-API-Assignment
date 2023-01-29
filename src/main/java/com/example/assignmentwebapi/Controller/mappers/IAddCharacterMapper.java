package com.example.assignmentwebapi.Controller.mappers;
import com.example.assignmentwebapi.models.Character;
import com.example.assignmentwebapi.Controller.dto.AddCharacterDTO;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface IAddCharacterMapper {
    public AddCharacterDTO toAddCharacterDTO(Character character);
    public Character toAddCharacter(AddCharacterDTO addCharacterDTO);

}
