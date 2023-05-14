package org.example.less;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Vladislav Osada
 * @date 14.05.2023 13:48
 */
@Component
public class Character {
    private Weapon weapon1;

    private Weapon weapon2;

    @Autowired
    public Character(@Qualifier("sword") Weapon weapon1,
                     @Qualifier("fireBall") Weapon weapon2) {
       this.weapon1 = weapon1;
       this.weapon2 = weapon2;
    }

    public void launchAttack(){
        System.out.println("Персонаж нанес следующую атаку " + weapon1.typeAttack());
    }
}
