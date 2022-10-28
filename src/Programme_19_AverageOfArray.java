/**
 * Write a Java program to calculate the average value of array
 */

import java.util.Arrays;

public class Programme_19_AverageOfArray {

    public static void main(String[] args) {

        int[] numArray = {      // Numeric array declaration
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;

        for (int i = 0; i < numArray.length; i++) {     // Calculating the sum of arrays value
            sum = sum + numArray[i];
        }

        int average = sum / numArray.length;           // Finding the average of arrays value
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are: " + average);
    }
}
