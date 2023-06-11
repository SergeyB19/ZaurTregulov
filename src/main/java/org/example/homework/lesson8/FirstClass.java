package org.example.homework.lesson8;

public class FirstClass {
    static final double Pi = 3.14;



    public static double multiplication(double a, double b, double c) {
        double result = a * b * c;
        System.out.println("Произведение чисел = " + result);
        return result;
    }

    public static void division(double a, double b) {
        double result = a / b;
        double result2 = a % b;
        System.out.println("Целое частное= " + result + " Остаток = " + result2);
    }

    public double radius(double a) {
        double result = Pi * a * a;
        System.out.println("Радиус круга ="  + result);
        return result;
    }

    public static double radiusLength(double a) {
        double result = 2 * Pi * a;
        System.out.println("Длина окружности равна = " + result);
        return result ;
    }

    public void infoRadius(double a) {
        System.out.println("Радиус = "+ a);
        System.out.println("Площадь круга = " + radius(a));
        System.out.println("Длина окружности = " + radiusLength(a));
    }


}
