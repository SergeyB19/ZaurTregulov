package org.example.homework;

public class Lesson3 {
    public static void main(String[] args) {
        // Вычислите следующую часть кода
        int i1 = 5;
        int i2 = 10;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l; //
        System.out.println(result);
        int a = 5;
        var i = a-- - --a + ++a + a++ + a; // 5(4) - 3 + 4 + 4 + 5 = 14
        System.out.println(i);
        int b = 8;
        var f = ++b - b++ + ++b - --b; // 9 - 9(10) + 11 - 10 = 1
        System.out.println(f);
    }
}
