package org.example.homework.lesson6;

public class StudentOverload {
    int studentTicketNumber;
    String name;
    String surname;
    int year;
    int course;
    int gradeMath;
    int gradeEconomy;
    int gradeEnglish;
    double averageGrade;

    public StudentOverload(int studentTicketNumber, String name, String surname, int year, int course, int gradeMath, int gradeEconomy, int gradeEnglish, double averageGrade) {
        this.studentTicketNumber = studentTicketNumber;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.course = course;
        this.gradeMath = gradeMath;
        this.gradeEconomy = gradeEconomy;
        this.gradeEnglish = gradeEnglish;
        this.averageGrade = averageGrade;
    }

    public StudentOverload(int studentTicketNumber1, String name1, String surname1, int year1, int course1) {
        this(studentTicketNumber1, name1, surname1, year1, course1, 0, 0, 0, 0);
    }

    public StudentOverload() {
    }
}

class StudentOverloadTest {
    public static void main(String[] args) {

        StudentOverload studentOverload = new StudentOverload();
        StudentOverload studentOverload1 = new StudentOverload();
        StudentOverload studentOverload2 = new StudentOverload();
    }
}

