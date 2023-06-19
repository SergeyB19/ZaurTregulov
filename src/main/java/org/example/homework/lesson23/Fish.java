package org.example.homework.lesson23;

public abstract class Fish extends Animal{

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda interesno nablyuadat, kak spyat ribi");
    }
    abstract void swim();
}
