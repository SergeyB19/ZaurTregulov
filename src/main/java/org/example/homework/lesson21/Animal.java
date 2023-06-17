package org.example.homework.lesson21;

public class Animal {
    Animal() {
        System.out.println("I am animal");
    }

    int eyes;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class testAnimal {
    public static void main(String[] args) {
        System.out.println(new Animal());
    }
}
