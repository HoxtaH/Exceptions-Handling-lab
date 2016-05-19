package com.tyrellhoxter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class ExceptionsSpec {
    @Test
    public void divideByZeroTest(){
        Calculator calculator = new Calculator();
        double expected = 7;
        double actual = 0;
        try {
            actual = calculator.divide(14, 2);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("The expected value should be an exception", expected, actual, Math.ulp(.0001));
    }

    @Test
    public void complexNumberTest(){
        Calculator calculator = new Calculator();
        double expected = 2;
        double actual = 0;
        try {
             actual = calculator.squareRoot(-2);
        } catch (ComplexNumberException e) {
            e.printStackTrace();
        }
     Assert.assertEquals("The expected should be a complex number exception", expected, actual, Math.ulp(.0001));
    }

    @Test(expected = ComplexNumberException.class)
    public void testComplexNumberException() throws ComplexNumberException {
        Calculator calculator = new Calculator();
        calculator.squareRoot(-4);
    }
}
