//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src//words.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] wordarray = new Word[size];
		
		for (int i = 0; i <size ; i++) 
		{
			wordarray[i] = new Word(file.next());
		}
		Word temp = null;
		Arrays.sort(wordarray);
		for (Word a : wordarray) {
			System.out.println(a);
		}








	}
}