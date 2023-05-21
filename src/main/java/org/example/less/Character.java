package org.example.less;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Vladislav Osada
 * @date 14.05.2023 13:48
 */
@Component
@Scope("prototype")
public class Character {
    private Weapon weapon1;

    private Weapon weapon2;
    @Value("${character.level}")
    private int level;
    @Value("${character.race}")
    private String race;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Autowired
    public Character(@Qualifier("sword") Weapon weapon1, @Qualifier("fireBall") Weapon weapon2) {
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
    }

    public void launchAttack() {
        System.out.println("Персонаж нанес следующую атаку " + weapon1.typeAttack());
    }
}
