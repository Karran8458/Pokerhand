import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

//--------------------------------------------------------------------------
// Reads from the file, sends the file as a string to the PokerHand class
// , creates an output file, and prints to the output file and the console.
//--------------------------------------------------------------------------
public class PokerHandTest
{
	public static void main (String [] args) throws IOException
	{
		PokerHand cardStack; // calls the PokerHand constructor to initialize the suit, rank and value for 5 cards.
		String handofcards; // represents the first line of the file read as a string.
		String file = "pokerHands100000categorized.txt"; // represents the output file that will be created.
		Scanner fileScan; // reads each line of the file to copy to handofcards that is passed into the PokerHand constructor.
		Scanner scan = new Scanner ("pokerHands100000.txt"); // reads from the file.
		int category; // represents the value that is returned from the getCategory method from the PokerHand class.
		
		FileWriter fw = new FileWriter(file); // represents a text output file.
		BufferedWriter bw = new BufferedWriter(fw); // gives the output stream buffering capabilities.
		PrintWriter outFile = new PrintWriter (bw); // provides print and println methods.
		
		fileScan = new Scanner (new File ("pokerHands100000.txt")); // reads from the file.
		
		while (fileScan.hasNext()) // reads each token from the file.
		{
			handofcards = fileScan.nextLine(); // assigns handofcards to be the first line of the file.
			cardStack = new PokerHand (handofcards); // calls the constructor of PokerHand 
			                                         // to copy the first line of handofcards.
			
            category = cardStack.getCategory() ; // assigns the returned value from the getCategory method to be category.
			
			System.out.print(handofcards + " "); // prints the String handofcards to the console.
			outFile.print(handofcards + " "); // prints the String handofcards to the output file.
            
			if (category == 1) // checks to see if there are no hands.
			{
				outFile.println("Nothing"); // prints to the file.
				System.out.println("Nothing"); // prints to the console.
			}
			
            if (category == 2) // checks to see if there is a One Pair hand.
            {
              outFile.println("One Pair");
              System.out.println("One Pair");
            }
            
            if (category == 3) // checks to see if there is a Two Pair hand.
            {
              outFile.println("Two Pair");
              System.out.println("Two Pair");
            }
			
            if (category == 4) // checks to see if there is a Three of a Kind hand.
		    {
              outFile.println("Three of a Kind");
			  System.out.println("Three of a Kind");
			}
            
			if (category == 5) // checks to see if there is a Straight hand.
			{
			  outFile.println("Straight");
			  System.out.println("Straight");
			}
			  
			if (category == 6) // checks to see if there is a Flush hand.
			{
			  outFile.println("Flush");
			  System.out.println("Flush");
			}
			
			if (category == 7) // checks to see if there is a Full House hand.
			{
			  outFile.println("Full House");
			  System.out.println("Full House");
			}
			
			if (category == 8) // checks to see if there is a Four of a Kind hand.
			{
			  outFile.println("Four of a Kind");
			  System.out.println("Four of a Kind");
			}
			
			if (category == 9) // checks to see if there is a Straight Flush hand.
			{
			  outFile.println("Straight Flush");
			  System.out.println("Straight Flush");
			}	
			
		}
		outFile.close(); // closes the output file.
		
		
		
		
		
	}
}
