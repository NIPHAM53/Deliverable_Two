import java.util.Scanner;

public class CountingHeadsOrTails {

	public static void main(String[] args) {
	System.out.println("Guess which will have more: Heads or Tails?");
	boolean valid = false;
	while (!valid) {
	Scanner scnr = new Scanner(System.in); 
	String headsorTailsGuess = scnr.nextLine();
	if (headsorTailsGuess.equals("Heads") || headsorTailsGuess.equals("Tails")) {
	valid = true;
	} else {
		System.out.println("You must choose Heads or Tails and spell it exactly how it is written.");
			
		
	}
	if (headsorTailsGuess.equals("Heads") || headsorTailsGuess.equals("Tails")) {
		valid = true;
		System.out.println("How many times shall we flip");
		int numberOfFlips = scnr.nextInt();
		int tailCount = 0;
		int headCount = 0;
		for (int i=0; i < numberOfFlips; i++) {
			int flip = (int) (Math.random() * 2);
			if (flip == 0) {
				System.out.println("Heads");
				headCount++;																																																	
			}else 
				System.out.println("Tails");
				tailCount++;
		} 
	int correctCount = numberOfFlips - headCount;
	float percentage;
	percentage = (float)((correctCount*100)/numberOfFlips);
	if (headsorTailsGuess.equals("Tails")) {
		System.out.println("Your Guess, " + headsorTailsGuess + ", came up " + correctCount + " " +  "time(s) ." + "That's" + " " + percentage + "%");
	} else {
		System.out.println("Your Guess, " + headsorTailsGuess + ", came up " + (numberOfFlips - correctCount) + " " +  "time(s) ." + "That's" + " " + (100-percentage) + "%");
	}
	
	
	}
			
	}
	}	
	}
		
		
		
		
	


