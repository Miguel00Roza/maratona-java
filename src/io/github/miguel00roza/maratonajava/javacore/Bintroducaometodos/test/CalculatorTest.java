package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.test;

import io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        calculator.subtractTwoNumbers();
        calculator.multiplyTwoNumbers(5, 1.2);

        double resultado = calculator.dividingTwoNumbers(10, 5);
        int[] numbers = {1, 3, 5, 7, 10};
        calculator.sumArray(numbers);
        calculator.sumVarArgs(2, 4, 5, 6, 1, 2);
    }
}
