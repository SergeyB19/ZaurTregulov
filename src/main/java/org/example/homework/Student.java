package org.example.homework;

public class Student {
    int studentTicketNumber;
    String name;
    String surname;
    int year;

    int gradeMath;
    int gradeEconomy;
    int gradeEnglish;
    double averageGrade;

}

class StudentTest {


    double averageStudentGrade(Student student) {
        double averageGradeInMethod = (student.gradeMath + student.gradeEconomy + student.gradeEnglish) / 3;
        System.out.println("Средняя оценка студента " + student.name + student.surname + ": "+ + averageGradeInMethod);
        return averageGradeInMethod;
    }
    public static void main(String[] args) {

        Student studentFirst = new Student();
        Student studentSecond = new Student();
        Student studentThree = new Student();

        studentFirst.studentTicketNumber = 1;
        studentFirst.name = "Ivan";
        studentFirst.surname = "Ivanov";
        studentFirst.year = 2010;
        studentFirst.gradeMath = 4;
        studentFirst.gradeEconomy = 5;
        studentFirst.gradeEnglish = 3;
        studentFirst.averageGrade = ((double) (studentFirst.gradeMath + studentFirst.gradeEconomy + studentFirst.gradeEnglish) /3);
        System.out.println();

        System.out.print("Имя ");
        System.out.println(studentFirst.name);
        System.out.print("Фамилия ");
        System.out.println(studentFirst.surname);
        System.out.print("Год выпуска ");
        System.out.println(studentFirst.year);
        System.out.print("Оценка по математике ");
        System.out.println(studentFirst.gradeMath);
        System.out.print("Оценка по экономике ");
        System.out.println(studentFirst.gradeEconomy);
        System.out.print("Оценка по иностранному языку ");
        System.out.println( studentFirst.gradeEnglish);
        System.out.print("Средняя оценка ");
        System.out.println(studentFirst.averageGrade);
        System.out.println();


        studentSecond.studentTicketNumber = 8;
        studentSecond.name = "Petr";
        studentSecond.surname = "Petrov";
        studentSecond.year = 2011;
        studentSecond.gradeMath = 3;
        studentSecond.gradeEconomy = 3;
        studentSecond.gradeEnglish = 5;
        studentSecond.averageGrade = ((double) (studentFirst.gradeMath + studentSecond.gradeEconomy + studentFirst.gradeEnglish) /3);

        System.out.print("Имя ");
        System.out.println(studentSecond.name);
        System.out.print("Фамилия ");
        System.out.println(studentSecond.surname);
        System.out.print("Год выпуска ");
        System.out.println(studentSecond.year);
        System.out.print("Оценка по математике ");
        System.out.println(studentSecond.gradeMath);
        System.out.print("Оценка по экономике ");
        System.out.println(studentSecond.gradeEconomy);
        System.out.print("Оценка по иностранному языку ");
        System.out.println( studentSecond.gradeEnglish);
        System.out.print("Средняя оценка ");
        System.out.println(studentSecond.averageGrade);
        System.out.println();


        studentThree.studentTicketNumber = 14;
        studentThree.name = "Snoop";
        studentThree.surname = "Dog";
        studentThree.year = 2017;
        studentThree.gradeMath = 4;
        studentThree.gradeEconomy = 3;
        studentThree.gradeEnglish = 4;
        studentThree.averageGrade = ((double) (studentThree.gradeMath + studentThree.gradeEconomy + studentThree.gradeEnglish) /3);

        System.out.print("Имя ");
        System.out.println(studentThree.name);
        System.out.print("Фамилия ");
        System.out.println(studentThree.surname);
        System.out.print("Год выпуска ");
        System.out.println(studentThree.year);
        System.out.print("Оценка по математике ");
        System.out.println(studentThree.gradeMath);
        System.out.print("Оценка по экономике ");
        System.out.println(studentThree.gradeEconomy);
        System.out.print("Оценка по иностранному языку ");
        System.out.println( studentThree.gradeEnglish);
        System.out.print("Средняя оценка ");
        System.out.println(studentThree.averageGrade);

        StudentTest studentTest = new StudentTest();
        studentTest.averageStudentGrade(studentFirst);
        studentTest.averageStudentGrade(studentSecond);
        studentTest.averageStudentGrade(studentThree);


    }
}




