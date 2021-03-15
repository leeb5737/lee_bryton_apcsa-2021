//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test1 = new ToyStore();
		test1.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		test1.toString();
		System.out.println("Returning list of toys :: "+test1);
		test1.sortToysByCount();
		System.out.println("Returning toy \"sorry \" :: " +test1.getThatToy("sorry"));
		System.out.println("Returning toy with highest count :: " +test1.getMostFrequentToy());
		System.out.println("Returning sorted list of toys :: "+test1);
	}
}