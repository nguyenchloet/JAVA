// Program that prints all even numbers of a set stored in array size 20.
// Initialize array with random numbers using SecureRandom class 

import java.security.SecureRandom; 

public class EvenNums
{
	public static void main(String[] args) 
	{
		final int SIZE = 20;
		SecureRandom rand = new SecureRandom();		//create instance of SecureRandom class
		int[] array = new int[SIZE];		//create array size 20
					
		System.out.println("Even numbers within the array size 20: ");
		System.out.println("Index     Value");
		for (int counter = 1; counter < SIZE; counter++)
		{
			array[counter] = rand.nextInt(100);
			if (array[counter] % 2 == 0)
			{
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
			//print full array 
			//System.out.printf("%5d%8d%n", counter, array[counter]); 
		}
	}
}
