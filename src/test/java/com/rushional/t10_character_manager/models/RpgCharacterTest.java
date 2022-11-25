package com.rushional.t10_character_manager.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RpgCharacterTest {
    @Test
    public void testCloning() {
        RpgCharacter character1 = new RpgCharacter();
        RpgCharacter character2 = new RpgCharacter(character1);
        assertEquals(character1.getClass(), character2.getClass());
        assertEquals(character2, character1);
        assertEquals(character1.getAbout(), character2.getAbout());
        assertEquals(character1.getFeats().getFeatsList().get(0), character2.getFeats().getFeatsList().get(0));
        assertEquals(character1.getStats().getDexterity(), character2.getStats().getDexterity());
        character1.setAbout("about has been changed");
        assertNotEquals(character1.getAbout(), character2.getAbout());
        character1.addFeat("Cool as fuck");
        assertTrue(character1.getFeats().getFeatsList().contains("Cool as fuck"));
        assertFalse(character2.getFeats().getFeatsList().contains("Cool as fuck"));
        character1.getStats().setDexterity(22);
        assertNotEquals(character1.getStats().getDexterity(), character2.getStats().getDexterity());
    }
}