
import java.util.*;


public class War
{
   int player1Count,player2Count;
   Card top1Card = new Card(0,0);
   Card top2Card = new Card(0,0);
   Deck deck = new Deck();
   ArrayList<Card> player1Stack = new ArrayList<Card>(26);
   ArrayList<Card> player2Stack = new ArrayList<Card>(26);
   public War()
   {
      int i;
      for (i = 0; i<26; i++)
      {
         player1Stack.add(deck.getCard(i));
         int secondi = i + 26;
         player2Stack.add(deck.getCard(secondi));
         System.out.println(player1Stack.get(i));
         System.out.println("XXXXXX");
         System.out.println(player2Stack.get(i));
       }
       //tester
//        for (i = 0; i<26; i++)
//        {
//           System.out.println(player1Stack.get(i));
//        }
//        System.out.println("XXXXXX");
//        for (i = 0; i<26; i++)
//        {
//          System.out.println(player2Stack.get(i));
//        }
   }  
   public void Play()
   {
      player1Count = 26;
      player2Count = 26;
      top1Card = player1Stack.get(0);
      top2Card = player2Stack.get(0);
      if (top1Card.getRank() > top2Card.getRank())
         {
            System.out.println("player 1 win");
         }
      else if (top2Card.getRank() > top1Card.getRank())
         {
            System.out.println("player 2 win");
         }
      else if (top2Card.getRank() == top1Card.getRank())
         {
            System.out.println("lol war");
         }
    }
   public static void main(String[] args)
   {
   War w = new War();
   }
}