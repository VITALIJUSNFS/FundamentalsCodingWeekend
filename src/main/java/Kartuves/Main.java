package Kartuves;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String word1 = "Volvo";
        Scanner inputScanner = new Scanner(System.in);

        Hangman game = new Hangman();
        game.setSecretWord(word1);
        game.setDisguisedWord();

        System.out.println();
        System.out.println("What is the safest car brand?");

        while (true) {
            System.out.println("");
            System.out.println("The disguised word is " + game.getDisguisedWord());
            System.out.println("Guess a letter:");
            char guess = inputScanner.next().charAt(0);
            game.guessCount();
            boolean isFound = game.guessLetter(guess);
            if (isFound) {
                System.out.println(game.getResult() + " No. of guesses made is " + game.getGuesses() + " with " + game.getWrongGuess() + " wrong");
                System.out.println("Good job, you found the secret word which is " + game.getSecretWord());
                break;
            } else {
                System.out.println(game.getResult() + " No. of guesses made is " + game.getGuesses() + " with " + game.getWrongGuess() + " wrong");
            }
        }
    }
}
