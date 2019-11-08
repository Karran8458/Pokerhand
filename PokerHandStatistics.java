//--------------------------------------------------------------------
// CS 190 - Project 4
//
// Based on my empirical results of the 10,000,000 hands created, 
// my results were accurate to the statistical probability of 
// each hand. This is true even when I run the program many times. 
// This means that my Poker Hand program works effectively.
// This project helped me with learning the different card
// hands for Poker.
// 
// Created by Karran Gowda
//--------------------------------------------------------------------
public class PokerHandStatistics 
{
	//---------------------------------------------------------------------
	// Creates 10000000 hands randomly.
	// For each category, the number of hands that are created is printed.
	//---------------------------------------------------------------------
	public static void main (String [] args)
	{
	  PokerHand cardStack; // represents a hand.
	  int fiveStack = 0; // used in the while loop to generate 10000000 hands.
	  int category; // represents the value returned by the getCategory method from the PokerHand class.
	  PlayingCard card1, card2, card3, card4, card5; // represents each of the cards from the hand.
	  
	  int [] counter = new int [9]; // used to count how many times each hand shows up in each category.
	  
	  Deck myDeck; // creates a new myDeck variable.
	  
	  myDeck = new Deck(); // calls the Deck class to initialize the deck of cards.
	  
	  while (fiveStack < 10000000) // randomly generates 10000000 hands.
	  {
	  
	  myDeck.shuffle(); // shuffles the deck of cards.
	  
	  card1 = myDeck.deal(); // takes out a card from the top of the deck.
	  
	  card2 = myDeck.deal();
	  
	  card3 = myDeck.deal();
	  
	  card4 = myDeck.deal();
	  
	  card5 = myDeck.deal();
	  
	  cardStack = new PokerHand (card1, card2, card3, card4, card5); // calls the second PokerHand constructor.
	  
	  category = cardStack.getCategory(); // assigns the value returned by getCategory to category.
	  
	  if (category == 1) // Nothing
	  {
		  counter[category-1] = counter[category-1] + 1; // counts how many times that hand appears.
	  }
	  
	  if (category == 2) // One Pair
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 3) // Two Pair
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 4) // Three of a Kind
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 5) // Straight
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 6) // Flush
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 7) // Full House
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 8) // Four of a Kind
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  if (category == 9) // Straight Flush
	  {
		  counter[category-1] = counter[category-1] + 1;
	  }
	  
	  fiveStack++; // increments the variable so the next random hand can be classified.
	  
	  }
	  
	  System.out.println( " Results after dealing 10000000 hands");
	  
	  System.out.println( " Category 0 ( Nothing) occurred " + counter[0] + " times "); // prints the number of times the hand randomly shows up.
	  
	  System.out.println( " Category 1 ( One Pair) occurred " + counter[1] + " times ");
	  
	  System.out.println( " Category 2 ( Two Pair) occurred " + counter[2] + " times ");
	  
	  System.out.println( " Category 3 ( Three of a Kind) occurred " + counter[3] + " times ");
	  
	  System.out.println( " Category 4 ( Straight) occurred " + counter[4] + " times ");
	  
	  System.out.println( " Category 5 ( Flush) occurred " + counter[5] + " times ");
	  
	  System.out.println( " Category 6 ( Full House) occurred " + counter[6] + " times ");
	  
	  System.out.println( " Category 7 ( Four of a Kind) occurred " + counter[7] + " times ");
	  
	  System.out.println( " Category 8 ( Straight Flush) occurred " + counter[8] + " times ");
	  
	}
	
}
