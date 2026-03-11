package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        // Loop para imprimir os salários caso nao for nulo
        if (this.salaries != null) {
            System.out.print("Salaries: ");
            for (double salary : this.salaries) {
                System.out.print(salary + " ");
            }
            System.out.print("\n");
        }
        averageSalary();
    }

    public void averageSalary() {
        if (this.salaries == null) {
            System.out.println("There are no salaries registered");
            return;
        }
        double sumSalaries = 0;
        for (double salary : this.salaries) {
            sumSalaries += salary;
        }
        double average = sumSalaries / this.salaries.length;
        System.out.println("The average salary is: " + average);
    }
}
