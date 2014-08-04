package com.ekpo.june.math.lab.core;

/**
 * Computes aggregate operations on an array of numbers
 *
 * @author June Ekpo
 *
 */
public interface Aggregator {

    /**
     * Returns the number of elements in the array of numbers
     *
     * @param numbers
     * @return
     */
    public int count(double[] numbers);

    /**
     * Computes the sum on an array of numbers
     *
     * @param numbers
     * @return
     */
    public double sum(double[] numbers);

    /**
     * Computes the average on an array of numbers
     *
     * @param numbers
     * @return
     */
    public double average(double[] numbers);
}
