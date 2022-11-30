package com.rushional.t10_character_manager.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rushional.t10_character_manager.models.CharVersionHistory;
import com.rushional.t10_character_manager.models.RpgCharacter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {
    private CharVersionHistory charVersions = new CharVersionHistory();

    public CharacterController() {
        charVersions.add(new RpgCharacter());
    }

    @GetMapping("/character")
    public String character() {
        //Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        try {
            return mapper.writeValueAsString(getCurrent());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "JSON parse failed";
        }
    }

    private RpgCharacter getCurrent() {
        List<RpgCharacter> characterList = charVersions.getCharactersList();
        return characterList.get(characterList.size() - 1);
    }
}
