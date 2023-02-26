// Tested with CoinTest.java
// Coin class: String sideUp will hold either heads or tails
// Flip a coin ten times, print each iteration and count number of heads and tails

import java.security.SecureRandom;

class Coin {
	public static String sideUp; {

	}
	//no arg constructor that randomly determines the side of the coin facing up and initialized accordingly
	public void Coin() {
		toss();
	}

	public static void toss() {
		SecureRandom r = new SecureRandom();
		int tossNum = r.nextInt(2); // r.nextInt() for r between (0 / heads - 1 /tails)
		if (tossNum == 0)  {
			sideUp = "heads"; 
		} else {
			sideUp = "tails"; 
		}
	}

	//get method, return sideUp value
	public static String getSide() {
		return sideUp;
	}
}
