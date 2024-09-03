package com.example.demo;

import com.example.demo.model.Character;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * Test class for the Character class
 */
@SpringBootTest
public class CharacterTest {

    @Test
    public void testEquals() {
        Character Naruto = new Character("Naruto", "Naruto Uzumaki", true, "Blonde", "Ninjutsu", "Hidden Leaf Village");
        Character Naruto2 = Naruto;
        Character Sasuke = new Character("Naruto", "Sasuke Uchiha", true, "Black", "Ninjutsu", "Hidden Leaf Village");
        Character Sasuke2 = new Character("Naruto", "Sasuke Uchiha", true, "Black", "Ninjutsu", "Hidden Leaf Village");
        Character Gintoki = new Character("Gintama", "Gintoki", true, "Silver", "Swordsmanship", "Edo");
        Character Kagura = new Character("Gintama", "Kagura", false, "Orange", "Super Deezed", "Alien");
        assert !Naruto.equals(Sasuke);
        assert !Sasuke.equals(Gintoki);
        assert !Gintoki.equals(Naruto);
        assert Naruto2.equals(Naruto);
        assert Sasuke2.equals(Sasuke);
        assert !Kagura.equals(Gintoki);
    }
}
