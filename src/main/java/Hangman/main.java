package Hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        String words = "Volvo";

        Scanner inputScanner = new Scanner(System.in);

        String hiddenText = words;
        char[] textArray = hiddenText.toCharArray();
        char[] myAnswers = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            myAnswers[i] = '?';
        }

        boolean finished = false;
        int lives = 5;

        while (finished == false) {
            System.out.print("*******************");
            String letter = inputScanner.next();
            while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
                System.out.print("Error, try again");
            }
            boolean found = false;
            for (int i = 0; i < textArray.length; i++) {
                if (letter.charAt(0) == textArray[i]) {
                    found = true;
                }
            }
            if (!found) {
                lives--;
                System.out.print("Wrong letter");
            }
            boolean done = true;
            for (int i = 0; i < myAnswers.length; i++) {
                if (myAnswers[i] == '?') {
                    System.out.print("_");
                    done = false;
                } else {
                    System.out.println(" " + myAnswers[i]);
                }
            }

            System.out.println("\n" + "Lives left:" + lives);

            if (done) {
                System.out.println("Congrat- you win");
                finished = true;
            }
            if (lives <= 0) {
                System.out.println(" You out of lives");
                finished = true;
            }
        }
    }

}
