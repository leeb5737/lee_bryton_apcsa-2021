//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int o = 1; o <= a && o <= b && o <= c; o++) {
			  if(a%o==0 && b%o==0 & b%o==0 && c%o==0)
	                max = o;
		}


		return max;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i<number; i++) {
			for (int j = i + 1; j < number; j++) {
				for (int k = 1; k <= number; k++) {
					if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && 
							((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) &&
							(greatestCommonFactor(i, j, k) <= 1)
							){
						output+= i + " " + j + " " + k +"\n";
					}
				}
			}
		}






		return output+"\n";
	}
}