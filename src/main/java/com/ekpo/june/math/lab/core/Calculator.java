package com.ekpo.june.math.lab.core;

public interface Calculator {

    /**
     * Adds the first number to the second number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public int add(int a, int b);

    /**
     * Subtracts the second number from the first number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public int subtract(int a, int b);

    /**
     * Multiplies the first number with the second number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public int multiply(int a, int b);

    /**
     * Divides the first number by the second number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public double divide(int a, int b);

    /**
     * Adds the first number to the second number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public double add(double a, double b);

    /**
     * Subtracts the second number from the first number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public double subtract(double a, double b);

    /**
     * Multiplies the first number with the second number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public double multiply(double a, double b);

    /**
     * Divides the first number by the second number
     *
     * @param a first number
     * @param b second number
     * @return the result
     */
    public double divide(double a, double b);

    /**
     *  Divides the first number by the second number and returns the remainder
     *
     * @param a first number
     * @param b second number
     * @return the remainder
     */
    public int modulus(int a, int b);
}
