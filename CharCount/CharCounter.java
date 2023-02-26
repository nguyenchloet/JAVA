// Vowel/consonant counter for CharCount.java

import java.util.Scanner;

public class CharCounter {
	public static void main(String[] args) {
		char letter;

		//get string input from user
		Scanner scanner = new Scanner(System.in);
     	System.out.println("Please enter a word to count vowels/consonants: ");
     	String input = scanner.nextLine();
     	//System.out.println(input);

     	CharCount cc = new CharCount(input); //object created
     	System.out.println("The number of vowels is: " + cc.getVowelCount());
     	System.out.println("The number of consonants is: " + cc.getConsonantCount());
  }
}
