package com.dia.tres;
/**	
 * Rock Paper Scissors
 * 
 * Let's play! You have to return which player won!
 * In case of a draw return Draw!.
 * 
 * Examples:
 * rps('scissors','paper') // Player 1 won!
 * rps('scissors','rock') // Player 2 won!
 * rps('paper','paper') // Draw!
 * 
 * -> Scissors beats paper,
 * -> Paper beats rock,
 * -> Rock beats scissors.
 */

public class Kata {
	
	public static String rps(String p1, String p2) {
	    
		// Player 1 won.
		if(p1.toUpperCase().equals("SCISSORS") && p2.toUpperCase().equals("PAPER"))
			return "Player 1 won!";
		if(p1.toUpperCase().equals("PAPER") && p2.toUpperCase().equals("ROCK"))
			return "Player 1 won!";
		if(p1.toUpperCase().equals("ROCK") && p2.toUpperCase().equals("SCISSORS"))
			return "Player 1 won!";
		
		// Player 2 won.
		if(p2.toUpperCase().equals("SCISSORS") && p1.toUpperCase().equals("PAPER"))
			return "Player 2 won!";
		if(p2.toUpperCase().equals("PAPER") && p1.toUpperCase().equals("ROCK"))
			return "Player 2 won!";
		if(p2.toUpperCase().equals("ROCK") && p1.toUpperCase().equals("SCISSORS"))
			return "Player 2 won!";
		
		//Draw!.
		return "Draw!";
		
	}
}
