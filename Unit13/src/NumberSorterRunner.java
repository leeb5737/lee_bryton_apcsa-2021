//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class NumberSorterRunner
{
	public static void main(String args[])
	{
		NumberSorter a = new NumberSorter();
		int[] cases = {567891, 901912468, 864213507, 898777, 234422};
		for( int test : cases )
		{
			int[] one = a.getSortedDigitArray( test );
			for(int item : one)
			{
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}