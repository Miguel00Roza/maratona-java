package io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.test;

import io.github.miguel00roza.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        calculator.subtractTwoNumbers();
        calculator.multiplyTwoNumbers(5, 1.2);
        calculator.dividingTwoNumbers(10, 3);
    }
}
