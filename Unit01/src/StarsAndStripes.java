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
      out.println("By: Bryton L.");
      printOneBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printOneBlankLines()
   {
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