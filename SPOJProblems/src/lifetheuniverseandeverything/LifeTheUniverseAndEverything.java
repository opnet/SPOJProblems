package lifetheuniverseandeverything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**Problem description:
 * 
 * Your program is to use the brute-force approach in order to 
 * find the Answer to Life, the Universe, and Everything. 
 * More precisely... rewrite small numbers from input to output. 
 * Stop processing input after reading in the number 42. All 
 * numbers at input are integers of one or two digits.
 */

public class LifeTheUniverseAndEverything
{
	public static void main(String[] args) 
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> inputNumbers = new ArrayList<>();
		final int sentinel = 42;
		int input = 0;
		boolean found = false;
		
		while(!found)
		{
			System.out.print("Enter a number: ");
			
			try
			{
				input = Integer.parseInt(stdin.readLine());
				
				if(input == sentinel)
					found = true;
				
				else
					inputNumbers.add(input);
			}
			
			catch (NumberFormatException e)
			{
				System.out.println("The answer clearly has to be a number.");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		for(int i : inputNumbers)
			System.out.println(i);
	}
}
