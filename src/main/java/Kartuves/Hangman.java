package Kartuves;

public class Hangman {

        private String secretWord;
        private String disguisedWord = "";
        private String result;
        private int guesses = 0;
        private int wrongGuess = 0;

        public void setSecretWord(String word) {
            secretWord = word;
        }

        public void setDisguisedWord() {
            for (int i = 0; i < secretWord.length(); i++) {
                disguisedWord += "*";
            }
        }

        public void guesses() {
            guesses++;
        }

        public boolean guessLetter(char c) {
            for (int i = 0; i < disguisedWord.length(); i++) {
                if (c == secretWord.charAt(i)) {
                    disguisedWord = disguisedWord.substring(0, i) + c + disguisedWord.substring(i + 1);
                    result = "Correct.";
                } else {
                    result = "Incorrect";
                }
            }

            if (secretWord.equals(disguisedWord)) {
                return true;
            } else {
                wrongGuess++;
                return false;
            }
        }

        public String getDisguisedWord() {
            return disguisedWord;
        }

        public String getResult() {
            return result;
        }

        public int getGuesses() {
            return guesses;
        }

        public int getWrongGuess() {
            return wrongGuess;
        }

        public String getSecretWord() {
            return secretWord;
        }

    public void guessCount() {
    }
}

