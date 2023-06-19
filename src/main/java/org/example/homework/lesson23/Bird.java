package org.example.homework.lesson23;

public abstract class Bird extends Animal implements Speakable{
    Bird(String name) {
        super(name);
        this.name = name;
    }

    public abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}
