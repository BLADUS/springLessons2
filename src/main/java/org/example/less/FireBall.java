package org.example.less;

import org.springframework.stereotype.Component;

/**
 * @author Vladislav Osada
 * @date 14.05.2023 13:59
 */
@Component("fireBall")
public class FireBall implements Weapon{
    @Override
    public String typeAttack() {
        return "Урон магией 20 ед " + "Постепенный урон".repeat(3);
    }
}
