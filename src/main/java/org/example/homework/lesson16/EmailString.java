package org.example.homework.lesson16;


public class EmailString {
    public static void main(String[] args) {
        email("ona@gmail.com;");
    }



    public static String email(String nameEmail) {
        char a = (char) nameEmail.indexOf('@');
        char b = (char) nameEmail.lastIndexOf(';');
        String d = nameEmail.substring(a, b);
        System.out.println(d);

        return d;
    }
}

