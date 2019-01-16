package edu.kirkwood.ken.gambling;

public class Deck 
{
    private Card[] deck = new Card[52];
    private int cardsUsed;
    
    public Deck()
    {
        int cardCt = 0;
        cardsUsed = 0;
        
        for(int suit = 0; suit <= 3; suit++)
        {
            for(int face = 1; face <= 13; face++ )
            {
                deck[cardCt] = new Card(suit, face);
                cardCt++;
            }
        }
    }
    
    public void shuffle()
    {
        for( int i = deck.length - 1; i > 0; i--)
        {
            int rand = (int)(Math.random() * (i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
    
    public Card deal()
    {
        cardsUsed ++; 
        return deck[cardsUsed -1];
    }
    
    public int getCardsLeft()
    {
        return 52 - cardsUsed;
    }
}
