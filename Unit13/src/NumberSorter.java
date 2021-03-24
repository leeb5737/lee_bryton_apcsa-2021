//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private int getNumDigits(int number)
	{
		int count = number %10;
		return count;
	}

	public int[] getSortedDigitArray(int number)
	{
		String a = "" +number;
		int b = number;
		int[] sorted = new int[a.length()];
		for (int i = 0; i < a.length(); i++) {
			sorted[i] = getNumDigits(b);
			b = b / 10;
		}
		int temp;
		for (int i = 0; i < a.length()-1; i++) {
			if (sorted[i] > sorted[i+1]) {
				temp = sorted[i];
				sorted[i]= sorted[i+1];
				sorted[i+1] = temp;
				i = -1;
			}
		}
		return sorted;
	}
}