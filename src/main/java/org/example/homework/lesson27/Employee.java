package org.example.homework.lesson27;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;

    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ameli", "IT", 1_700_000);
        Employee employee2 = new Employee("Rozamund", "3", 1_550_000);
        Employee employee3 = new Employee("Lili", "5", 1_930_000);
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);

        TestEmployee testEmployee = new TestEmployee();
        testEmployee.filtraciyaRabotnikov(arrayList, (Employee em) -> em.department.equals("IT") && em.salary > 200);
        System.out.println("__________________________________");
        testEmployee.filtraciyaRabotnikov(arrayList, (Employee em) -> em.name.startsWith("E") && em.salary != 450);
        System.out.println("__________________________________");
        testEmployee.filtraciyaRabotnikov(arrayList, (Employee em) -> em.name.equals(em.department));

    }
    public static void printEmployee (Employee emp){
        System.out.print(emp.name + " " + emp.department + " " + emp.salary);
    }

    public static void filtraciyaRabotnikov (ArrayList < Employee > arrayList, Predicate < Employee > predicate){
        for (Employee emp : arrayList) {
            if (predicate.test(emp)) {
                printEmployee(emp);
            }
        }
    }
}
