package ArrayExercises;

import java.util.Arrays;

public class MinMax4 {
    public static void main(String[] args) {

        int[] myNumbers = {1, 7, 3, 10, 9};
        int min = myNumbers[0];
        int max = myNumbers[0];

        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] < min) {
                min = myNumbers[i];
            }
            if (myNumbers[i] > max) {
                max = myNumbers[i];
            }
        }
        System.out.println("Array is : " + Arrays.toString(myNumbers));
        System.out.println("Min vaue is = "+min + ", Max value is = " + max);
    }
}

