package com.ekpo.june.math.lab.test;

import org.junit.Assert;
import org.junit.Test;

import com.ekpo.june.math.lab.core.BasicArithmetic;
import com.ekpo.june.math.lab.core.Calculator;

public class BasicArithmeticTest {

    @Test
    public void validateIntegerAddition() {
        Calculator addCalc = new BasicArithmetic();
        int actualResult = addCalc.add(15, 20);
        int expectedResult = 35;

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void validateFloatingPointAddition(){
        BasicArithmetic floatAdd = new BasicArithmetic();
        double actualResult = floatAdd.add(1.5, 2.5);

        Assert.assertEquals(4.0,actualResult, 0.0);

    }

    @Test
    public void validateIntegerSubtraction(){
        BasicArithmetic subCalc = new BasicArithmetic();
        int actualResult = subCalc.subtract(40, 25);

        Assert.assertEquals(15, actualResult);

    }

    @Test
    public void validateFloatingPointSubtraction(){
        Calculator floatSub = new BasicArithmetic();
        double actualResult = floatSub.subtract(7.45, 3.50);

        Assert.assertEquals(3.95, actualResult, 0.01);
    }

    @Test
    public void validateIntegerMultiplication(){
        BasicArithmetic multCalc = new BasicArithmetic();
        int actualResult = multCalc.multiply(15, 20);

        Assert.assertEquals(300, actualResult);

    }

    @Test
    public void validateFloatingPointMultiplication(){
        Calculator floatMult = new BasicArithmetic();
        double actualResult = floatMult.multiply(2.50, 3.50);

        Assert.assertEquals(8.75, actualResult, 0.0);

    }

    @Test
    public void validateIntegerDivision(){
        BasicArithmetic divisionCalc = new BasicArithmetic();
        double actualResult = divisionCalc.divide(25, 10);

        Assert.assertEquals(2.0, actualResult, 0.0);
    }

    @Test
    public void validateFloatingPointDivision(){
        Calculator floatDivision = new BasicArithmetic();
        double actualResult = floatDivision.divide(25.0, 10.0);

        Assert.assertEquals(2.5,actualResult, 0.01);
    }

    @Test
    public void validateModulus2510(){
            Calculator modulCalc = new BasicArithmetic();
            int actualResult = modulCalc.modulus(25, 10);

            Assert.assertEquals(5,actualResult);
    }

    @Test
    public void validateModulus2515(){
            Calculator modulCalc = new BasicArithmetic();
            int actualResult = modulCalc.modulus(25, 15);

            Assert.assertEquals(10,actualResult);
    }

    @Test
    public void validateModulus3215(){
            Calculator modulCalc = new BasicArithmetic();
            int actualResult = modulCalc.modulus(32, 15);

            Assert.assertEquals(2,actualResult);
    }

}
