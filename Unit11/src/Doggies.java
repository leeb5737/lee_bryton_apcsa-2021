//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot]= new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int old = 0;
		int placeholder = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > old) {
				placeholder = i;
				old = pups[i].getAge();
			}
		}
		return "" + pups[placeholder].getName();
	}

	public String getNameOfYoungest()
	{
		int old = pups[0].getAge();
		int placeholder = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < old) {
				placeholder = i;
				old = pups[i].getAge();
			}
		}
		return "" + pups[placeholder].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}