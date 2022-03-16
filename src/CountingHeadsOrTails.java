import java.util.Scanner;

public class CountingHeadsOrTails {

	public static void main(String[] args) {
	System.out.println("Guess which will have more: Heads or Tails?");
	Scanner scnr = new Scanner(System.in); 
	String headsorTailsGuess = scnr.nextLine();
	System.out.println("How many times shall we flip the coin?");
	int numberOfFlips = scnr.nextInt();
	int random = (int)(Math.random()*2);
	}

}
