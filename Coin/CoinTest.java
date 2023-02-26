// CoinTest.java program to run Coin.java
import java.util.*;

public class CoinTest {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		Coin c = new Coin();

		// System.out.println("The side initially facing up: " + c.getSide() );
		System.out.println("We will toss a coin 10 times: ");
		
		// iterate 10 times (0 - 9)
		for (int i = 0; i < 10; i++) {  
			c.toss();
			System.out.println("Toss: " + c.getSide());
			if (c.getSide().equalsIgnoreCase("heads")) {
				heads++;
			} else { 
				tails++;
			}
		}

		System.out.println("Heads count: " + heads);
		System.out.println("Tails count: " + tails);
	}
}
