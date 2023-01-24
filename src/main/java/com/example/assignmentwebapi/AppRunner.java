package com.example.assignmentwebapi;

import com.example.assignmentwebapi.service.CharacterService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    private final CharacterService characterService;

    public AppRunner(CharacterService characterService){
        this.characterService = characterService;
    }

    @Override
    public void run (ApplicationArguments args) throws Exception{

        System.out.println("It's ALIVE!");

    }
}
