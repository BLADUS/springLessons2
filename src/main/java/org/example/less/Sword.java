package org.example.less;

import org.springframework.stereotype.Component;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:39
 */
@Component("sword")
public class Sword implements Weapon{
    @Override
    public String typeAttack() {
        return "Режущий урон 60.ед";
    }
}
