package org.example.homework.lesson10.p4;
import org.example.homework.lesson10.p1.A;
import org.example.homework.lesson10.p1.p2.B;
import org.example.homework.lesson10.p1.p2.p3.C;
import org.example.homework.lesson10.p4.p5.E;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);
    }

}

