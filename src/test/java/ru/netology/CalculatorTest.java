package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void sumTest() {
        var calculator = new Calculator();
        int result = calculator.plus.apply(2, 5);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void minusTest() {
        var calculator = new Calculator();
        int result = calculator.minus.apply(3, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void multiplyTest() {
        var calculator = new Calculator();
        int result = calculator.multiply.apply(3, 4);
        Assertions.assertEquals(12, result);

    }

    @Test
    public void devideByZeroTest() {
        var calculator = new Calculator();
        int result = calculator.devide.apply(5, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void positiveNumberTest() {
        var calculator = new Calculator();
        boolean result = calculator.isPositive.test(3);
        Assertions.assertTrue(result);
    }
}