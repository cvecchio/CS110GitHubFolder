//Chris Vecchio
//CS110
//Deck class
import java.util.Random; 
 
public class Deck
   {
   public static final int NUM_CARDS = 52;
   private static Card[] deck;
   public Deck()
   {
      deck = new Card[NUM_CARDS];
      int i = 0;
      for(int rank=1; rank<=13; rank++)
         {
         for (int suit=Card.SPADES; suit<=Card.DIAMONDS; suit++)
            {
               deck[i] = new Card(rank,suit);
               i++;
            }
         }
Random r = new Random();
for(int x=0;x<52;x++)
{
int num = r.nextInt(51);
while(x==num)
{
num=r.nextInt(51);
}
Card switcher = new Card(0,0);
switcher = deck[x];
deck[x]=deck[num];
deck[num]=switcher;
}
}
   public Card getCard(int T)
   {
     return deck[T];
   }
      public static void main (String [] args)
   {
      Deck deck = new Deck();
      for(int i = 0; i<52; i++)
      {
         System.out.println(deck.getCard(i));
      }
   }

}
