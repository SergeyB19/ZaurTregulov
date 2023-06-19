package org.example.homework.lesson23;

public  class Main {

    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Riba");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.sleep();
        mechenosec.swim();

        Speakable speakable = new Pingvin("Pingvi");
        speakable.speak();

        Animal animal = new Lev("Simba");
        System.out.println(animal.name);
        animal.eat();
        animal.sleep();

        Mammal mammal = new Lev("Sherstiyanoi");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.sleep();
        mammal.run();
        mammal.speak();


    }
}
