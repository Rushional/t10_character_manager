package com.rushional.t10_character_manager.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CharVersionHistory {
    private List<RpgCharacter> charactersList = new ArrayList<>();

    public void add(RpgCharacter character) {
        charactersList.add(character);
    }
}
