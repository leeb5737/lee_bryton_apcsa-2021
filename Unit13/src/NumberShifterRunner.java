//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter a = new NumberShifter();
		for (int i = 0; i < 10; i++) {
			int [] b = a.makeLucky7Array(10);
			System.out.print(Arrays.toString(b)); 
			a.shiftEm(b);
			System.out.println(Arrays.toString(b)); 
		}
	}
}



