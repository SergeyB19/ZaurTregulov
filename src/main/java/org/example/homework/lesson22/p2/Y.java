package org.example.homework.lesson22.p2;

import org.example.homework.lesson22.p1.X;

public class Y extends X {
    Y() {

    }
    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
