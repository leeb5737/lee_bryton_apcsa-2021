//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		loadToys("");
	}
	public ToyStore(String toys) {
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		for (String str : toys.split(" ")) {
			int holder = 0;
			for (Toy toy : toyList) {
				if ((toy.getName()).equals(str)) {
					toy.setCount(toy.getCount()+1);
					holder = 1;
					
				}
			}
			if (holder == 0) {
				toyList.add(new Toy(str));
			}
			holder = 0;
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy : toyList) {
  			if ((toy.getName()).equals(nm)) return toy;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		Toy maxholder = null;
  		for (Toy toy : toyList) {
  			if (toy.getCount() > max) {
  				maxholder = toy;
  				max = toy.getCount();
  			}
  		}
  		return maxholder.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy transfer;
  		for (int i = 0; i < toyList.size()-1; i++) {
  			if ((toyList.get(i).getCount()) < (toyList.get(i+1).getCount())) {
  				transfer = toyList.get(i);
  				toyList.set(i, toyList.get(i+1));
  				toyList.set(i+1, transfer);
  				i = 0;
  			}
  		}
  	}  
  	  
	public String toString()
	{
		return "" + Arrays.asList(toyList);
	}
}