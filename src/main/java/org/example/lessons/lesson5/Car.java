package org.example.lessons.lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println(color+ " " + engine + " " + speed);
    }

}

class Car2 {
    public static void main(String[] args) {

        Car car = new Car();
        car.color = "white";
        car.engine = "v6";
        car.speed = 60;
        car.showInfo();
        car.gaz(20);
        car.showInfo();
        car.tormoz(80);
        car.showInfo();

    }


}
