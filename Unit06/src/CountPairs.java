//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int strlen= 0;
		String tempa =str;
		while (tempa.length() >= 2) {
			if (tempa.substring(0,1).compareTo(tempa.substring(1,2)) == 0){
				tempa = tempa.substring(1);
				count++;
			}
			else {
				tempa = tempa.substring(1);
			}
		}
		return count;
	}
}