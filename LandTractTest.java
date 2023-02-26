// LandTractTest tester method for LandTract.java
// Create array of THREE LandTract objects initialized with user input.
// Print input stored in array by invoking toString method
// Use equals method to compare at least two LandTract objects and print whether equal size or not
import java.util.*;
import java.util.Scanner;

public class LandTractTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//create array of THREE LandTract objects initialized with user input.
		LandTract[] arr = new LandTract[3];

		//user input 3 LandTrack length and widths
		System.out.print("Enter the length of tract 1:  ");
		double l = s.nextDouble();
		System.out.print("Enter the width of tract 1:  ");
		double w = s.nextDouble();
		
		System.out.print("Enter the length of tract 2:  ");
		double l2 = s.nextDouble();
		System.out.print("Enter the width of tract 2:  ");
		double w2 = s.nextDouble();
		
		System.out.print("Enter the length of tract 3:  ");
		double l3 = s.nextDouble();
		System.out.print("Enter the width of tract 3:  ");
		double w3 = s.nextDouble();

		//print by invoking toString method
		LandTract t1 = new LandTract(l, w);
		System.out.println("\nInfo of LandTract 1 \n" + t1.toString() + "\n"); 

		LandTract t2 = new LandTract(l2, w2);
		System.out.println("Info of LandTract 2 \n" + t2.toString() + "\n");
	
		LandTract t3 = new LandTract(l3, w3);
		System.out.println("Info of LandTract 3 \n" + t3.toString() + "\n"); 

		//compare areas 
		if (t1.getArea(l,w) == t2.getArea(l2, w2)) { //compare at least 2 LandTract objects to find whether equal or not.
        	System.out.println("The tracts 1 and 2 are the same size.");
        } else {
           System.out.println("The tracts 1 and 2 are NOT the same size.");
        }

        if (t2.getArea(l2,w2) == t3.getArea(l3, w3)) {
        	System.out.println("The tracts 2 and 3 are the same size.");
        } else {
           System.out.println("The tracts 2 and 3 are NOT the same size.");
        }

        if (t1.getArea(l,w) == t3.getArea(l3, w3)) {
        	System.out.println("The tracts 1 and 3 are the same size.");
        } else {
           System.out.println("The tracts 1 and 3 are NOT the same size.");
        }
   	}
}
