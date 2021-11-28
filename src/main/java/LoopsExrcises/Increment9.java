package LoopsExrcises;

import java.util.Scanner;

public class Increment9 {
    public static void main(String[] args) {

        System.out.print("Enter value = ");
        Scanner scanner = new Scanner(System.in);
        int firstNNumbers = scanner.nextInt();

        System.out.print("Outcome = ");
        int sum=0;
        for (int i = 0; i < firstNNumbers; i++) {
            sum=sum+firstNNumbers;
            System.out.print(sum+" ");
        }
    }
}
