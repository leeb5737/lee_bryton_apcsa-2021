//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive t5 = new TriangleFive('C',4);
	   System.out.print(t5);
	   
	   t5.setAmount(5);
	   t5.setLetter('A');
	   System.out.print(t5);
	   
	   t5.setAmount(7);
	   t5.setLetter('B');
	   System.out.print(t5);
	   
	   t5.setAmount(6);
	   t5.setLetter('X');
	   System.out.print(t5);
	   
	   t5.setAmount(8);
	   t5.setLetter('Z');
	   System.out.print(t5);
	}
}