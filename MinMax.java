// Program to compute smallest and largest of a set of values stored in an array.
// Asks user for set size (hence array size)
// Populate array with user input

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxArray
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);	//won't work without System.in
		System.out.println("Enter the array size: ");
		int input = sc.nextInt();

		System.out.println("Array size = " + input);

		int array[] = new int[input];
		System.out.println("Enter array values: ");
		for (int i = 0; i < array.length; i++) //fill array with user input values
		{
			array[i]=sc.nextInt();
		}

//		System.out.println("Array is: ");		
//		for (int i = 0; i < array.length; i++) //print array for reference
//              {
//                      System.out.println(array[i]);
//              }
		

		int minValue = minValue(array);
		System.out.println("Minimum value: " + minValue);
		int maxValue = maxValue(array);
		System.out.println("Maximum value: " + maxValue);
	}	

	public static int minValue(int[] array)
	{
		int minValue = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < minValue)
			{
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	public static int maxValue(int[] array) 
	{
		int maxValue = array[0];
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] > maxValue)
			{
				maxValue = array[i];
			}
		}
		return maxValue;
	}
}
