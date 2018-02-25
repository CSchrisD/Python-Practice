/*
Instructions:

Write a program called Game that will ask the user to guess a number and 
compare their guess to a stored integer value between 1 and 100.

    Use a field called answer to store the expected answer.
    For now, just hard-code the stored value; we will create a random value later 
    (your code will be easier to debug if you know the correct answer).

    Create a method called play() that holds the logic for the guessing. Use the KeyboardReader 
    class to ask for a number between 1 and 100, read the result, and tell the user if they are too low, correct, or too high.

    Create a main method, have it create a new instance of Game and call play().
*/

import util.*;

public class Game {
	private int answer = 54;

	public void play() {
		int guess  = KeyboardReader.getPromptedInt("Please guess a number between 1 and 100: ");

		if(0 < guess && guess < 101) {
			if(guess == answer) {
				System.out.println("Correct!");
			} else if(guess < answer) {
				System.out.println("Too low");
			} else {
				System.out.println("Too High");
			}
		} else {
			System.out.println("Your guess was not within the specified range");
		}
	}

	public static void main(String[] args){
		new Game().play();

	}
}