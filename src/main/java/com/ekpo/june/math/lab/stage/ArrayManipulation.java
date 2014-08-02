package com.ekpo.june.math.lab.stage;

/**
 * Array Length
 *
 * This class illustrates how to declare an array type and how to count the number of elements in the array
 *
 * @author June Ekpo <june.ekpo@gmail.com>
 */
public class ArrayManipulation {

    /**
     * An example that determines how many elements they are in the array
     * Then it will go through each element and print them out in a loop
     *
     * @param args
     */
    public static void main(String[] args) {

        // type[] variable = {elements}
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        // The array.length property tells us how many elements the array contains
        System.out.println("The are " + numbers.length + " elements in the numbers array");

        // Now let's loop through all of the elements in the array and print them out
        for (int i=0; i < numbers.length; i++) {
            System.out.println("The element at index " + i + " is " + numbers[i]);
        }
    }

}
