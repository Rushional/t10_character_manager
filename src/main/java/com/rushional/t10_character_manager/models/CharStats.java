package com.rushional.t10_character_manager.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharStats implements Cloneable {
//    TODO: implement clone(). Do I need to do anything other than the default super.clone() though?
//     would be a good practice anyway, I think, just in case we eventually want to add something else
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String skills;
    private String saveThrows;
    private String defence;
    private String proficiencies;

    public CharStats() {
        strength = 10;
        dexterity = 18;
        constitution = 12;
        intelligence = 8;
        wisdom = 10;
        charisma = 15;
        skills = "performance, funny jokes, stealth, programming";
        saveThrows = "fortitude 2, reflex 100, will 5";
        defence = "AC 19, also brows so big they reflect arrows I dunno";
        proficiencies = "can wear sneakers, does it count?";
    }

    public CharStats(CharStats source) {
//        Currently cloning is faster, but I don't want to later change the class and also
//         have to change all the cloning calls. And seeing how I prefer the copy constructors...
        strength = source.strength;
        dexterity = source.dexterity;
        constitution = source.constitution;
        intelligence = source.intelligence;
        wisdom = source.wisdom;
        charisma = source.charisma;
        skills = source.skills;
        saveThrows = source.saveThrows;
        defence = source.defence;
        proficiencies = source.proficiencies;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharStats)) return false;
        CharStats stats2 = (CharStats) obj;
        return strength == stats2.strength &&
            dexterity == stats2.dexterity &&
            constitution == stats2.constitution &&
            intelligence == stats2.intelligence &&
            wisdom == stats2.wisdom &&
            charisma == stats2.charisma &&
            skills.equals(stats2.skills) &&
            saveThrows.equals(stats2.saveThrows) &&
            defence.equals(stats2.defence) &&
            proficiencies.equals(stats2.proficiencies);
    }
}
