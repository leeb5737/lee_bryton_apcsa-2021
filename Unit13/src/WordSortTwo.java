//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int length = 0;
		for (String word : sentence.split(" ")) {
			length++;
		}
		wordRay = new String[length];
		int pos = 0;
		for (String word : sentence.split(" ")) {
			wordRay[pos] = word;
			pos++;
		}
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length-1; i++) {
			if (wordRay[i].compareTo(wordRay[i+1]) > 0){
				String temp = wordRay[i];
				wordRay[i] = wordRay[i+1];
				wordRay[i+1] = temp;
				
				i = -1;
			}
				
			
		}
	}

	public String toString()
	{
		String output="";
		for (String word : wordRay) {
			output+= word + "\n";
		}
		return Arrays.toString(wordRay);
	}
}