package org.example.homework.lesson7_1;

import org.example.homework.lesson7.Employee;

public class EmployeeThree {
    public static void main(String[] args) {
        Employee emp = new Employee(3_000_000,"Bellucci", 4);
        emp.money();
        emp.name();
        emp.numberId();

    }
}
