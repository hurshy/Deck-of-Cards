
package cardgame;

import edu.kirkwood.ken.gambling.Card;
import edu.kirkwood.ken.gambling.Deck;

public class CardGame 
{

    public static void main(String[] args)
    {
        /*
        Card c1 = new Card(0, 1);
        Card c2 = new Card(1, 3);
        Card c3 = new Card(2, 13);
        Card c4 = new Card(3, 11);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        */
        
        Deck myDeck = new Deck();
        Card temp = new Card();
        myDeck.shuffle();
        
        for(int i = 0; i <52; i++)
        {
            temp = myDeck.deal();
            System.out.println(temp);
        }
    }
    
}
