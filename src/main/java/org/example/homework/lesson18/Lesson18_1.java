package org.example.homework.lesson18;

import java.util.Arrays;

public class Lesson18_1 {

    public static void showArray(String[][] array) {
        System.out.print("( ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print("( ");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("),");
            } else {
                System.out.print(")");
            }
        }
        System.out.println(" )");
    }


    public static void main(String[] args) {
        String[][] twoArr = {{"a", "b"},{"c", "d"},{"e", "i"}};
        showArray(twoArr);
    }
}
