package ArrayExercises;

import java.util.Arrays;

public class SecondLargestElement9 {
    public static void main(String[] args) {

        int[] myArray = {1, 7, 3, 10, 9};
        System.out.println("Given Array: " + Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println("Second largest number: " + myArray[(myArray.length - 1)]);
    }
}
