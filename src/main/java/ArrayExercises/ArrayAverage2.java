package ArrayExercises;

import java.util.Arrays;

public class ArrayAverage2 {
    public static void main(String[] args) {

        int[] myNumbers = {1, 7, 3, 10, 9};

        int sum = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            sum = sum + myNumbers[i];

        }
        System.out.println("Array is : " + Arrays.toString(myNumbers));
        System.out.println("Array average value is = " + sum / myNumbers.length);
    }
}

