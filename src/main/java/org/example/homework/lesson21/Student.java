package org.example.homework.lesson21;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

//    public Student(StringBuilder name, int course, int grade) {
//        this.name = name;
//        this.course = course;
//        this.grade = grade;
//    }

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3)
            this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5)
            this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11)
            this.grade = grade;
    }

    public static void showInfo(Student student) {
        System.out.println("Имя студента " + student.getName()+ " "+ "Курс "+ student.getCourse() + " Оценка " +  student.getGrade());

    }
}


class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        StringBuilder sb1 = new StringBuilder("Ivan");
        student.setName(sb1);
        student.setCourse(2);
        student.setGrade(8);
        Student.showInfo(student);
    }
}
