package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.test;

import io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Minato";
        employee.age = 26;
        employee.salaries = new double[]{1214.00, 1615.00, 3020.00};

        employee.printData();
    }
}
