package ArrayExercises;

import java.util.Arrays;

public class OddNumber3 {

    public static void main(String[] args) {

        int[] myNumbers = {1, 7, 3, 10, 9};

        System.out.println("Array is : " + Arrays.toString(myNumbers));
        System.out.print("Odd numbers are: ");
        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] % 2 != 0)
                System.out.print(myNumbers[i] + " ");
        }
    }
}
