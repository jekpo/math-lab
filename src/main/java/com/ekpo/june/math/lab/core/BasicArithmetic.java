package com.ekpo.june.math.lab.core;

public class BasicArithmetic implements Calculator {

    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    @Override
    public double divide(int a, int b) {
        int result = a/b;
        return result;
    }

    @Override
    public double add(double a, double b) {
        double result = a + b;
        return result;
    }

    @Override
    public double subtract(double a, double b) {
        double result = a - b;
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        double result = a * b;
        return result;
    }

    @Override
    public double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    @Override
    public int modulus(int a, int b) {
        int result = a % b;
        return result;
    }

}
