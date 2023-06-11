package org.example.homework.lesson7;

public class Employee {
    private double Salary;
    public String Surname;

    protected int id;

    public void money() {
        System.out.println(Salary);
    }

    public void name() {
        System.out.println(Surname);
    }

    public void numberId() {
        System.out.println(id);
    }

    public Employee(double salary, String surname, int id) {
        this.Salary = salary;
        this.Surname = surname;
        this.id = id;
    }

//    default Employee(double salary, String surname, int id) {
//        this.Salary = salary;
//        this.Surname = surname;
//        this.id = id;
//    }
//
//    private Employee(double salary, String surname, int id) {
//        this.Salary = salary;
//        this.Surname = surname;
//        this.id = id;
//    }



}
