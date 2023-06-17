package org.example.homework.lesson22.p2;

import org.example.homework.lesson22.p1.X_1;

public class Y_1 extends X_1 {
    public void abc() {
        System.out.println("Y_1");
    }

    public void def() {
        Y_1 y1 = new Y_1();
        y1.abc();
    }

    public void ghi() {
        X_1 x1 = new X_1();
        x1.abc();
    }

    public static void main(String[] args) {
        Y_1 a = new Y_1();
        a.abc();
        a.def();
        a.ghi();
    }
}
