package org.example.homework.lesson22.p1;

import org.example.homework.lesson22.p2.Y_1;
import org.example.homework.lesson22.p2.Y_2;

public class X_2 {
    public X_2() {
        System.out.println("X");
    }

    public X_2(int i) {
        System.out.println("X"+i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X_2 x2 = new Y_2(18);
        System.out.println(x2.abc());

    }
}
