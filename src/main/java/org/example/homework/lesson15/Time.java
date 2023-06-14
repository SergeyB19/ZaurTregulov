package org.example.homework.lesson15;

public class Time {
    public static void main(String[] args) {
        timeConsole();


    }

    public static void timeConsole() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int min = -1;
            MIDDLE:
            do {
                min ++;
                if (hour > 1 && min % 10 == 0) {
                    break OUTER;
                }
                int sec = 0;
                INNER:
                while (sec < 60) {
                    if (sec * hour > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min +":" + sec);
                    sec++;
                }
            } while (min < 59);
            hour++;
        }


    }
}

