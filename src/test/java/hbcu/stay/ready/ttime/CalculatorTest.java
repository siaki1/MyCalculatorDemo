package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.multiply(5);
        double expected = 50;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator(50);
        double actual = calculator.divide(5);
        double expected = 10;

        Assert.assertEquals(expected, actual, 0);


    }
    @Test (expected = ArithmeticException.class)
    public void divideByZeroTest(){
        Calculator calculator = new Calculator(10);
        calculator.divide(0);
    }

    @Test
    public void squareTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.square(10);
        double expected = 100;

        Assert.assertEquals(expected, actual, 0);


    }

    @Test
    public void squareRootTest() {
        Calculator calculator = new Calculator(49);
        double actual = calculator.squareRoot(7);
        double expected = 7;

        Assert.assertEquals(expected, actual, 0);

    }
    @Test
    public void inverse(){
        Calculator calculator = new Calculator(7);
        double actual = calculator.inverse(7);
        double expected = -7;

        Assert.assertEquals(expected, actual, 0);

    }

    }
