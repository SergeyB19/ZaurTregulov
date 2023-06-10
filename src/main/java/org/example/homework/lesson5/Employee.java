package org.example.homework.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;

    int department;

    public Employee(int id, String surname, int age, int salary, int department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int salaryUp() {
        salary *= 2;
        return  salary;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeFirst = new Employee(1,"Rosamund",33,3_000_000,23);
        Employee employeeTwo = new Employee(17,"Salma",35,4_000_000,8);

        System.out.println("Зарплата " + employeeFirst.surname + " " + "увеличена до " +   employeeFirst.salaryUp());
        System.out.println("Зарплата " + employeeTwo.surname + " " + "увеличена до " +   employeeTwo.salaryUp());
    }
}
