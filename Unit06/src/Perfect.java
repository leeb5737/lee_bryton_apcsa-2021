//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number, truesum;
   public Perfect() {
	   number = 0;
   }
   public Perfect(int a) {
	   number = a;
   }
	//add constructors

	//add a set method
   public void setCalc(int value) {
	   number = value;
	   int i =1, max = (int) Math.ceil(number/2), sum = 0;
	   while (i <=max) {
		   if (number% i == 0) {
			   sum = sum + i;
			   i++;
		   }
		   else {
			   i++;
		   }
		   truesum = sum;
	   }
   }
	public String isPerfect()
	{
		if (truesum == number) {
			return "is perfect.";
		}
		else {
			return "is not perfect.";
		}
	}

	public String toString() {
		return number + " "+isPerfect() ;
	}
	//add a toString	
	
}