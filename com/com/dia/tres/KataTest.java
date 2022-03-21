package com.dia.tres;

import static org.junit.Assert.*;
import org.junit.Test;

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

public class KataTest {
	
	@Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata.rps("paper", "paper"));
        assertEquals("Draw!", Kata.rps("rock", "rock"));
    }

}
