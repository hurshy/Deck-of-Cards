package edu.kirkwood.gambling;
import java.util.ArrayList;

public class Hand {

   private ArrayList hand;   // The cards in the hand.

   // Construct and empty hand.  ArrayList is being used because the 
   // number of cards in the hand may vary from game to game.  
   // ArrayList is more flexible than an array since the array needs to 
   // Be given a size of the hand which may be unknown at the time.
   public Hand() {
      hand = new ArrayList();
   }
   
   public void clear() {
      hand.clear(); //Method of the ArrayList which removes all elements
   }
   

   public void addCard(Card c) {
 
      hand.add(c); //Method of the ArrayList which adds an element
   }
   
  
   public void removeCard(Card c) {
      hand.remove(c);//Method of the ArrayList which removes an element
   }
   
 
   public void removeCard(int position) {
      //Method of the ArrayList which removes an element at a specific position 
      hand.remove(position);
   }

 
   public int getCardCount() {
      return hand.size();//Method of the ArrayList which gives element count
   }
   
  
   public Card getCard(int position) {
       //Method of the ArrayList which gets an element at a specific postition
       return (Card)hand.get(position);
   }
   
 
   // This method orders the cards in the hand according to their suit
   public void sortBySuit() {
      ArrayList newHand = new ArrayList();
      while (hand.size() > 0) {
         int pos = 0;  // Position of minimal card.
         Card c = (Card)hand.get(0);  // Minimal card.
         for (int i = 1; i < hand.size(); i++) {
            Card c1 = (Card)hand.get(i);
            if ( c1.getSuit() < c.getSuit() ||
                    (c1.getSuit() == c.getSuit() && c1.getFace() < c.getFace()) ) {
                pos = i;
                c = c1;
            }
         }
         hand.remove(pos);
         newHand.add(c);
      }
      hand = newHand;
   }
   
   // This method orders the cards in the hand according to their value
   public void sortByValue() {
      ArrayList newHand = new ArrayList();
      while (hand.size() > 0) {
         int pos = 0;  // Position of minimal card.
         Card c = (Card)hand.get(0);  // Minimal card.
         for (int i = 1; i < hand.size(); i++) {
            Card c1 = (Card)hand.get(i);
            if ( c1.getFace() < c.getFace() ||
                    (c1.getFace() == c.getFace() && c1.getSuit() < c.getSuit()) ) {
                pos = i;
                c = c1;
            }
         }
         hand.remove(pos);
         newHand.add(c);
      }
      hand = newHand;
   }
   
}
