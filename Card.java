package edu.kirkwood.ken.gambling;

public class Card 
{
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    
    private int suit;
    private int face;
    
    public Card()
    {}
    
    public Card(int theSuit, int theFace)
    {
        suit = theSuit;
        face = theFace;
    }
    
    public int getSuit()
    { return suit;}
    
    public int getFace()
    { return face;}
    
    public String getFaceAsString()
    {
        switch(face)
        {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            default: return "King";            
        }
        
    }
    
    public String getSuitAsString()
    {
        switch(suit)
        {
            case 0: return "Spades";
            case 1: return "Hearts";
            case 2: return "Diamonds";
            default: return "Clubs"; 
        }
    }
    
    @Override
    public String toString()
    { return getFaceAsString() + " of " + getSuitAsString();}
    
    
}
