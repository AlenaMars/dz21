package org.example;
import java.lang.reflect.Array;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        Types [] types = {
                new Robot("Сириус модел 230", 4000, 0, "Робот"),
                new Robot("АРК 2000", 200, 40, "Робот"),
                new Human("Аркадий", 500, 140, "Человек"),
                new Human("Ирина", 300, 60, "Человек"),
                new Cat("Бобик", 10, 200, "Кот"),
                new Cat("Пушистик", 40, 230, "Кот"),
        };

        Obstacles [] obstacle = {
                new Wall(35),
                new Wall( 70 ),
                new Theadmill(1700),
                new Theadmill(50),
        };

        for (Types item: types) {;
            item.run (???); // Вот тут остановилась, как обратиться к массиву Obtacles ?
            item.jump (???);
        }

                }

}