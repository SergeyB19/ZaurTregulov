package org.example.homework.lesson23;

public class Pingvin extends Bird{

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    @Override
    public  void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}
