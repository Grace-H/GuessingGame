//This program asks the user to guess a number between 1 and 100 inclusive
//Author: Grace Hunter
//Date: 9/20/17

//import Scanner
import java.util.Scanner;

public class GuessingGame {
	
	public GuessingGame() {
		
		boolean stillPlaying = true; //create variable that tracks whether user still wants to play
		
		while (stillPlaying == true) {
			
			int number = (int)(Math.random()* 51); //generate random integer
			Scanner input = new Scanner(System.in); //create new scanner
			int userGuess = -1; //integer to store total guesses
			int guessTotal = 0; //integer to count total guesses
			System.out.println("Try to guess my number!");
			
			//keep asking for and evaluating the guess until the user guesses correctly
			while (userGuess != number) {
				
				//collect user guess and make into an integer
				String userInput = input.nextLine(); //
				userGuess = Integer.parseInt(userInput);
				
				guessTotal += 1; //increase total number of guesses by one
				
				if (userGuess == number) { //evaluate guess and give appropriate feedback
					System.out.println("You guessed my number! It took you " + guessTotal + " guesses.");
				}
				else if (userGuess > number) {
					System.out.println("Too high! Try again:");
				}
				else {
					System.out.println("Too low! Try again:");
				}
			}
			
			//ask if the user wants to play again
			System.out.println("Would you like to play again? (answer yes or no)");
			String playAgain = input.nextLine();
			if (playAgain.equals("yes")) {
				stillPlaying = true;
			}
			else {
				stillPlaying = false;
				System.out.println("Goodbye!");
			}
		}
	}
	public static void main(String[] args) {
		new GuessingGame();

	}

}
