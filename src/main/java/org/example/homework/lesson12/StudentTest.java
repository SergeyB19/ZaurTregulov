package org.example.homework.lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2, 7);
        Student st2 = new Student("Petr", 3, 8);
        equalsStudent(st1, st2);
        equalStudentPro(st1, st2);
    }


    public static void equalsStudent(Student st1, Student st2) {
        if ((st1.name.equals(st2.name)) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты равны");
        } else
            System.out.println("Студенты не равны");
    }

    public static void equalStudentPro(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов, курсы одинаковые, но оценки различаются");
                } }
                  else
                    System.out.println("Имена студентов одинаковые,но курсы различаются");}
                 else {
                    System.out.println("Имена студентов различаются");}}}
