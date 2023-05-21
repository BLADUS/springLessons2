package org.example.less;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:23
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Character character1 = context.getBean("character",Character.class);
        Character character2 = context.getBean("character",Character.class);

        System.out.println("Уровень персонажа1 " + character1.getLevel());
        System.out.println("Уровень персонажа2 " + character2.getLevel());
        character2.setLevel(5);
        System.out.println("Уровень персонажа1 " + character1.getLevel());
        System.out.println("Уровень персонажа2 " + character2.getLevel());

        context.close();
    }
}
