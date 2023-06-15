package org.example.homework.lesson18;

public class Lesson18 {

    public static int[] sortirovka(int [] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
            }
        return array;
        }



    public static void main(String[] args) {
        int[] arr2 = new int[]{5, 6, 4, 2, 6, 7, 8, 9, 0};
        sortirovka(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

}
