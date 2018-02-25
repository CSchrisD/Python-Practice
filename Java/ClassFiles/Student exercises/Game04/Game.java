/*
Instructions:
    Revise the number guessing program to force the user to guess 
    until they are correct (loop-wise, to keep guessing as long as they are incorrect).

    Then add more logic to ask if they want to play again, read a Y or N 
    as their answer, and loop as long as they enter a Y.
*/

import util.*;
import java.util.*;

public class Game {
	private Random r = new Random();
	private int answer = r.nextInt(100) + 1;
	private int range = 10;

	public Game(){
		this('I');
	}

	public Game(char level){
		switch(level){
			default:
				System.out.println("Invalid option: " + level + 
					", using beginner.");
			case 'b': 
			case 'B':
				range = 10;
				break;
			case 'i':
			case 'I':
				range = 100;
			case 'a':
			case 'A':
				range = 1000;
				break;
		}
		Random r = new Random();
		int answer = r.nextInt(range) + 1;
	}

	public void play() {
		int guess;
		do {
        	guess = KeyboardReader.getPromptedInt("Enter a number 1 - " + range + ": ");
        	if (guess < answer) System.out.println("Too low");
       	    else if (guess > answer) System.out.println("Too high");
       	   } while(guess != answer);

        System.out.println("Correct!");
	}

	public static void main(String[] args){
		char playAgain = 'Y';
		do {
			char level = KeyboardReader.getPromptedChar("What level (B, I, A)? ");
			new Game(level).play();
			playAgain = KeyboardReader.getPromptedChar("Play again (Y/N)? ");
		} while(playAgain == 'Y' || playAgain == 'y');

	}
}