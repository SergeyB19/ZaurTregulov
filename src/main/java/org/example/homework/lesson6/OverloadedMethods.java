package org.example.homework.lesson6;

public class OverloadedMethods {

    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println(result1);
        return result1;
    }

    int sum(int a, int b) {
        int result2 = a + b;
        System.out.println(result2);
        return result2;
    }

    int sum(int a, int b, int c) {
        int result3 = a + b + c;
        System.out.println(result3);
        return result3;
    }

    int sum(int a, int b, int c, int d) {
        int result4 = a + b + c + d;
        System.out.println(result4);
        return result4;
    }

    int sum(int a, int b, int c, int d, int e) {
        int result5 = a + b + c + d + e;
        System.out.println(result5);
        return result5;
    }
}

    class OverloadedMethodsTest {
        public static void main(String[] args) {
            OverloadedMethods oM = new OverloadedMethods();

            oM.sum();
            oM.sum(3);
            oM.sum(3, 5);
            oM.sum(3, 5, 7);
            oM.sum(3, 5, 7, 11);
        }
    }
