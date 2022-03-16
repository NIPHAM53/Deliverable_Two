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
		
		}
		}
	}

}
