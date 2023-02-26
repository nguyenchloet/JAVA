// Write a class with a constructor that accepts a String object as its argument.
// The class should have a method that returns the number of vowels in the string, 
// and another method that returns the number of consonants in the string. 
// Demonstrate the class in a program by invoking the methods that return the number of vowels and consonants. 
// Print the counts returned. 

public class CharCount {
	public final char[] vowels = {'a','e','i','o','u'};
	public final char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

	int vowelCount = 0;
	int consonantCount = 0;

	//constructor class that accepts String obj as argument
	public CharCount(String input) {
		getCharCount(input);
	}

	//method that returns the number of vowels in a string
	public int getVowelCount() {
		return vowelCount;
	}

	//method that returns the number of consonants in a string
	public int getConsonantCount() {
		return consonantCount;
	}

	private void getCharCount(String input) {
		boolean found;

		//vowel check
		for (int i = 0; i < input.length(); i++) { // iterate through string
			for (int j = 0; j < vowels.length; j++) { //iterate through vowels array
				if (input.charAt(i) == vowels[j]) {
					vowelCount++;
					found = true;
				}
			}
		}
		//consonant check
		for (int i = 0; i < input.length(); i++) { // iterate through string
			for (int j = 0; j < consonants.length; j++) { //iterate through consonants array
				if (input.charAt(i) == consonants[j]) {
					consonantCount++;
					found = true;
				}
			}
		}

	}
}
