package org.example.homework.lesson10.lesson11;

public class Car {

    String color;
    String engine;
    int doorCarQuantity;

    public Car(String color, String engine, int doorCarQuantity ) {
        this.color = color;
        this.engine = engine;
        this.doorCarQuantity = doorCarQuantity;
    }

}

class CarTest {


    public static void CarQuantityChange(Car c, int doorCarQuantity) {
        c.doorCarQuantity = doorCarQuantity;
    }

    public static void changeColor(Car CarColor1, Car CarColor2) {
        String color3 = CarColor1.color;
        CarColor1.color = CarColor2.color;
        CarColor2.color = color3;
    }

    public static void main(String[] args) {
        Car car = new Car("red","W12",4);
        Car car2 = new Car("green","W12",4);
        CarQuantityChange(car,7);
        changeColor (car,car2);
        System.out.println(car.doorCarQuantity);
        System.out.println(car.color);
    }

}
