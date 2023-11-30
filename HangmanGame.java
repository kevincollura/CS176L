package Week12;

import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"baseball", "basketball", "track", "soccer", "golf", "volleyball", "bowling", "football", "swim"};
    private static final int MAX_TRIES = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = selectRandomWord();
        char[] guessedWord = initializeGuessedWord(wordToGuess.length());
        int incorrectGuesses = 0;
        StringBuilder guessedLetters = new StringBuilder();

        while (incorrectGuesses < MAX_TRIES && !isWordGuessed(guessedWord)) {
            displayGameState(incorrectGuesses, guessedWord, guessedLetters.toString());
           
         
            System.out.println("Hint: It is a Sport.");
            System.out.print("\nEnter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (!isValidGuess(guess, guessedLetters.toString())) {
                System.out.println("Invalid guess. You've already guessed that letter.");
                continue;
            }

            guessedLetters.append(guess);

            if (containsLetter(wordToGuess, guess)) {
                updateGuessedWord(wordToGuess, guessedWord, guess);
            } else {
                incorrectGuesses++;
            }
        }

        displayGameResult(wordToGuess, guessedWord, incorrectGuesses);
        scanner.close();
    }

    private static String selectRandomWord() {
        return WORDS[(int) (Math.random() * WORDS.length)];
    }

    private static char[] initializeGuessedWord(int length) {
        char[] guessedWord = new char[length];
        for (int i = 0; i < length; i++) {
            guessedWord[i] = '-';
        }
        return guessedWord;
    }

    private static boolean isWordGuessed(char[] guessedWord) {
        for (char c : guessedWord) {
            if (c == '-') {
                return false;
            }
        }
        return true;
    }

    private static void displayGameState(int incorrectGuesses, char[] guessedWord, String guessedLetters) {
        System.out.println("\nCurrent wrong attemps: " + incorrectGuesses + "/8");
        System.out.println("The word is: " + new String(guessedWord));
        System.out.println("You already guessed the letters: " + guessedLetters);
    }

    private static boolean isValidGuess(char guess, String guessedLetters) {
        return !guessedLetters.contains(String.valueOf(guess));
    }

    private static boolean containsLetter(String word, char letter) {
        return word.indexOf(letter) != -1;
    }

    private static void updateGuessedWord(String word, char[] guessedWord, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedWord[i] = letter;
            }
        }
    }

    private static void displayGameResult(String wordToGuess, char[] guessedWord, int incorrectGuesses) {
        System.out.println("\nGame Over");

        if (isWordGuessed(guessedWord)) {
            System.out.println("Congratulations! The word is: " + wordToGuess);
        } else {
            System.out.println("Sorry, you have reached the limit: " + wordToGuess);
        }
    }
}
