package com.ekpo.june.math.lab.core;

/**
 * Boundary Locator
 *
 * Implementors of this interface are able to locate the minimum and maximum number elements of an array
 *
 * @author June Ekpo
 *
 */
public interface BoundaryLocator {

    /**
     * Locates and returns the smallest number in an array of numbers
     *
     * @param numbers
     * @return
     */
    public double min(double[] numbers);

    /**
     * Locates and returns the largest number in an array of numbers
     *
     * @param numbers
     * @return
     */
    public double max(double[] numbers);

    /**
     * Returns the difference between the minimum and maximum element in the array
     *
     * @param numbers
     * @return
     */
    public double range(double[] numbers);
}
