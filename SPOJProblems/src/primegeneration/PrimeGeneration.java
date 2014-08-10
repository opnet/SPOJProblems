package primegeneration;

/**
 * Find all prime numbers p between two numbers n and m, where n <= p <= m
 */

public class PrimeGeneration
{
	public static void main(String[] args)
	{
		boolean[] notPrime = new boolean[1000000000];
		
		for(int i = 3; i < notPrime.length; i += 2)
			for(int j = i + i; j < j * j && j < notPrime.length; j += i)
				notPrime[j] = true;
	}
}
