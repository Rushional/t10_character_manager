package com.rushional.t10_character_manager.models;

import lombok.Getter;
import lombok.Setter;

@Getter
public class RpgCharacter implements Cloneable {
    private final CharStats stats;
    private final CharFeats feats;
    @Setter
    private String about;
    @Setter
    private String spellbook;
    @Setter
    private String inventory;
    @Setter
    private String notes;

    public RpgCharacter() {
        stats = new CharStats();
        feats = new CharFeats();
        about = "beautiful and smart, but not very strong";
        spellbook = "guidance and maybe lightning arc";
        inventory = "has a leg";
        notes = "successfully implemented and tested a copy constructor";
    }

    public RpgCharacter(RpgCharacter source) {
        stats = new CharStats(source.getStats());
        feats = new CharFeats(source.getFeats());
        about = source.about;
        spellbook = source.spellbook;
        inventory = source.inventory;
        notes = source.notes;
    }

    public void addFeat(String feat) {
        feats.add(feat);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof RpgCharacter)) return false;
        RpgCharacter character2 = (RpgCharacter) obj;
        return stats.equals(character2.getStats()) &&
            feats.equals(character2.getFeats()) &&
            about.equals(character2.getAbout()) &&
            spellbook.equals(character2.getSpellbook()) &&
            inventory.equals(character2.getInventory()) &&
            notes.equals(character2.getNotes());
    }
}
