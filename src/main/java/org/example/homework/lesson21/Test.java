package org.example.homework.lesson21;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        System.out.println("Количество лап у собаки: " + dog1.paw);

        Cat cat1 = new Cat("Мурзик");
        cat1.sleep();
    }
}
