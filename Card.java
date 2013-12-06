//Chris Vecchio
//CS110
//Card Class
//

public class Card
{
//card types
   public static int SPADES = 0;
   public static int CLUBS = 1;
   public static int HEARTS = 2;
   public static int DIAMONDS = 3;
   public static int ACE = 0;
   public static int JACK = 11;
   public static int QUEEN = 12;
   public static int KING = 13;
   
   private Card[] specificCard;
   private final int suit;
   private final int rank;
   
   private String[] suits = {"SPADES", "CLUBS", "HEARTS", "DIAMONDS"};
   private String[] ranks = {"*","ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
   
   public Card(int cardRank, int cardSuit)
   {
      suit = cardSuit;
      rank = cardRank;
   }
   public Card(Card card)
   {
      suit = card.suit;
      rank = card.rank;
   }
   public int getSuit()
   {
      return suit;
   }
   public int getRank()
   {
      return rank;
   }
   
   public String toString()
   {
      return (ranks/**<array,int>*/[rank] + " of " + suits/**<array,int>*/[suit]);
   }
}