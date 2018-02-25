/*
Instructions:


    Revise your number guessing program to use if . . . else logic (you can test for too low and 
    too high, and put the message for correct in the final else branch).
    Once you have done that, here is a way to generate a random answer between 1 and 100:

        At the top:
        	import java.util.*;
        Add a private field for a random number generator:
        	private Random r = new Random();
        Then, you can initialize the answer field:
        	answer = r.nextInt(100) + 1;

        the nextInt(int n) method generates a number greater than or equal to 0 and less than n, 
        so r.nextInt(100) would range from 0 through 99; we need to add 1 to raise both ends of the range.
        You might want to print the expected correct answer to aid debugging.

Note that until we cover looping, there will be no way to truly "play" the game, since we have no way to preserve the value between runs.
*/

import util.*;
import java.util.*;

public class Game {
	private Random r = new Random();
	private int answer = r.nextInt(100) + 1;
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