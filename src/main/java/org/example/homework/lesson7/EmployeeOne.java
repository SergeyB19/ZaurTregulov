package org.example.homework.lesson7;

import org.example.homework.lesson7.Employee;

import java.util.Arrays;

public class EmployeeOne {
    public static void main(String[] args) {
        Employee emp = new Employee(3_200_000, "Spencer", 3);
        emp.money();
        emp.name();
        emp.numberId();
    }
}
