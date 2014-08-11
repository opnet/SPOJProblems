package primegeneration;

import java.io.IOException;
import java.util.Scanner;

/**
 * Find all prime numbers p between two numbers n and m, where n <= p <= m
 */

public class PrimeGeneration
{	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int sqrLimit = (int)Math.sqrt(1000000000);
		boolean[] found = new boolean[1000000000];
		
		for(int i = 3; i < sqrLimit; i += 2)
		{
			if(found[i])
				continue;
			
			for(int j = i + i; j < found.length; j += i)
				found[j] = true;
		}
	}
}
