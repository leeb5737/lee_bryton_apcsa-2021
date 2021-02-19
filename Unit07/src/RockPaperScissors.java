//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private char p,c;
	public RockPaperScissors()
	{
		playChoice ="";
		compChoice ="";
	}

	public RockPaperScissors(char player)
	{
		if (player == 'R') {
			playChoice = "Rock";
		}
		else if (player == 'P') {
			playChoice = "Paper";
		}
		else if (player == 'S') {
			playChoice = "Scissors";
		}
		
		p = player;
	}

	public void setPlayers(char player)
	{
		if (player == 'R') {
			playChoice = "Rock";
		}
		else if (player == 'P') {
			playChoice = "Paper";
		}
		else if (player == 'S') {
			playChoice = "Scissors";
		}
		
		p = player;
	}

	public String determineWinner()
	{
		String winner = "";
		double a = (Math.random()*3);
		a = Math.floor(a);
		if (a == 2.0) {
			compChoice = "Scissors";
			c = 'S';
		}
		else if (a == 1.0) {
			compChoice = "Paper";
			c = 'P';
		}
		else if (a == 0.0) {
			compChoice = "Rock";
			c = 'R';
		}
		
		if (c == p) {
			winner= "Player had: "+ p + "\nComputer had: " + c + "\n!Draw Game!";
		}
		else if ((c == 'S' && p == 'P') || (c == 'R' && p == 'S') || (c == 'P' && p == 'R')) {
			winner= "Player had: "+ p + "\nComputer had: " + c + "\n!Computer wins <<" + compChoice + " breaks " + playChoice + ">>!";
		}
		else {
			winner= "Player had: "+ p + "\nComputer had: " + c + "\n!Player wins <<" + playChoice + " breaks " + compChoice+ ">>!";
		}
		
		
		return winner;
	}

	public String toString()
	{
		return determineWinner();
	}
}