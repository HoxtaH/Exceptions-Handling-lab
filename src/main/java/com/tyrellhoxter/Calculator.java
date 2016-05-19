package com.tyrellhoxter;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class Calculator {
    public static double sum;

    public static double add(double a, double b){
        sum = a + b;
        return sum;
    }

    public static double subtract(double a, double b){
        sum = a - b;
        return sum;
    }

    public static double multiply(double a, double b){

        sum = a * b;
        return sum;
    }

    public static double divide (double a, double b) throws DivisionByZeroException {
     if(b == 0){
         throw new DivisionByZeroException();
     }else {
         sum = a / b;
         return sum;
        }
    }

    public static double squareRoot(double a) throws ComplexNumberException{
        if(a < 0) {
            throw new ComplexNumberException();
        }else {
            sum = Math.sqrt(a);
            return sum;
        }
    }

}
