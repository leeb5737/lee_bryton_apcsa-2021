//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		RockPaperScissors game = new RockPaperScissors();
		char response;
		
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			char a = 'y';
			while(a == 'y') {
				out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
				response = keyboard.next().charAt(0);
				game.setPlayers(response);
				out.print(game);
				
				out.print("\nDo you want to play again? ");
				a = keyboard.next().charAt(0);
			
			}
			
			//read in the player value
				
	}
}



