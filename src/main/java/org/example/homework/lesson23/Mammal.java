package org.example.homework.lesson23;

public abstract class Mammal extends Animal implements Speakable{
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}
