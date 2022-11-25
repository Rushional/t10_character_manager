package com.rushional.t10_character_manager.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CharFeats implements Cloneable {
    private List<String> featsList = new ArrayList<>();

    public CharFeats() {
        featsList.add("feat 1");
        featsList.add("feat 2");
        featsList.add("feat 3");
    }

    public CharFeats(CharFeats source) {
        featsList = new ArrayList<>(source.featsList);
    }

    public void add(String feat) {
        featsList.add(feat);
    }

    public Object clone() throws CloneNotSupportedException {
        CharFeats clone = (CharFeats)super.clone();
        return clone;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharFeats)) return false;
        return featsList.equals(((CharFeats) obj).featsList);
    }
}
