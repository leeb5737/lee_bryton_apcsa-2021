//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
public class Grid
{
   private String[][] grid;
   private String[] uniqueletters;
   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[cols][rows];
		uniqueletters = vals;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				int rand = (int)(Math.random() * vals.length);
				String val = vals[rand];
				grid[i][j] = val;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = -1;
		String temp = "";
		for (String j : uniqueletters) {
			if (countVals(j) > max) {
				for (String k : vals) {
					if (k.equals(j)) {
						max = countVals(j);
						temp = j;
					}
				}
			}
		}
		return temp +" occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (String[] i : grid) {
			for (String j : i) {
				if (j.equals(val)) count++;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
			output+= Arrays.toString(grid[i]) + "\n";
		}
		for (String j : uniqueletters) {
			output+= j + " count is: " + countVals(j) + "\n";
		}
		return output;
	}
}