package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(77 - 10);
    }

    public void multiplyTwoNumbers(double numberA, double numberB) {
        System.out.println(numberA * numberB);
    }

    public double dividingTwoNumbers(double numberA, double numberB) {
        return numberA / numberB;
    }

    public void sumArray(int[] arr) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... nums) {
        // nesse metodo a gente passa os números separados por vírgula ao invés de passar uma array
        // porem por trás dos panos a JVM vai transformar esses parâmetros em uma array
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
