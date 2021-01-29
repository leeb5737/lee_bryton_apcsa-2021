//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n");
	   out.println("\n");
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyStars();
	   printTwentyDashes();
   }   
}