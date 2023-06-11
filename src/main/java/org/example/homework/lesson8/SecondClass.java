package org.example.homework.lesson8;

public class SecondClass {
    public static void main(String[] args) {
        FirstClass fCOne = new FirstClass();
        fCOne.multiplication(5, 7, 8);
        fCOne.multiplication(5, 7, 8);
        FirstClass.multiplication(5, 4, 3);

        fCOne.division(27,5);
        fCOne.division(10,5);
        FirstClass.division(23,5);
        System.out.println();
        fCOne.radius(8);
        fCOne.radiusLength(200.96);
        System.out.println();
        fCOne.infoRadius(100);
    }
}
