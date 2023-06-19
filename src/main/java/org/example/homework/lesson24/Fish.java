package org.example.homework.lesson24;

public abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda interesno nablyuadat, kak spyat ribi");
    }
    abstract void swim();
}
