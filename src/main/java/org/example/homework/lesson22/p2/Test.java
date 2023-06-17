package org.example.homework.lesson22.p2;

import org.example.homework.lesson22.p1.X_3;

public class Test {
    public static void abc(X_3 x3, Y_3 y3) {
        System.out.println("Privet");
    }

    public static void abc(Y_3 y3, X_3 x3) {
        System.out.println("Poka");
    }

    public static void main(String[] args) {
        Y_3 a = new Y_3();
        abc((X_3) a,a);
    }
}
