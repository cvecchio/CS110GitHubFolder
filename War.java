//Chris Vecchio
//CS110
//War Game + command window game
//
//uses card

import java.util.*; 

public class War
{
   Card bottom1Card = new Card(0,0);
   Card bottom2Card = new Card(0,0);
   Card top1Card = new Card(0,0);
   Card top2Card = new Card(0,0);
   Deck deck = new Deck();
   //card stacks for players 1 & 2
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
      }
   }  
   public void Play()
   {
      //play game of war
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Play round? (yes/no): ");
      String input = keyboard.next();
      while (input.contains("yes"))
      {
         top1Card = player1Stack.get(0);
         top2Card = player2Stack.get(0);
         if (top1Card.getRank() > top2Card.getRank())
         {
            //player 1 win
            System.out.println(top1Card + " beats " + top2Card);
            bottom1Card = new Card(top1Card);
            player1Stack.add(bottom1Card);
            bottom1Card = new Card(top2Card);
            player1Stack.add(bottom1Card);
            player1Stack.remove(0);
            player2Stack.remove(0);
            System.out.println("Player 1 wins"); 
            System.out.println(player1Stack.size() + " and " + player2Stack.size());      
         }//close if topcard
         else if (top2Card.getRank() > top1Card.getRank())
         {
            //player 2 win
             System.out.println(top2Card + " beats " + top1Card);
             bottom2Card = new Card(top2Card);
             player2Stack.add(bottom2Card);
             bottom2Card = new Card(top1Card);
             player2Stack.add(bottom2Card);
             player1Stack.remove(0);
             player2Stack.remove(0); 
             System.out.println("Player 2 wins");
             //score
             System.out.println(player1Stack.size() + " and " + player2Stack.size());
          }
          else if (top2Card.getRank() == top1Card.getRank())
          {
          //war scenario
          System.out.println(top1Card + " matches " + top2Card);
          ArrayList<Card> WarStash = new ArrayList<Card>();
          WarStash.add(top1Card);
          WarStash.add(top2Card);
          player1Stack.remove(0);
          player2Stack.remove(0); 
          System.out.println("WAR!");
          if (player1Stack.size() > 1 && player2Stack.size() > 1)
          {
            //facedown card
            top1Card = player1Stack.get(0);
            top2Card = player2Stack.get(0);
            WarStash.add(top1Card);
            WarStash.add(top2Card);
            player1Stack.remove(0);
            player2Stack.remove(0);
            //play cards
            top1Card = player1Stack.get(0);
            top2Card = player2Stack.get(0);
            WarStash.add(top1Card);
            WarStash.add(top2Card);
            if (top1Card.getRank() > top2Card.getRank())
            {
               //player 1 wins war
               System.out.println("Player 1 wins");
               player1Stack.remove(0);
               player2Stack.remove(0);
               for (int n = 0; n < 6 ; n++)
               {
                  player1Stack.add(WarStash.get(n));
               }
               System.out.println("Player 1 wins War");
               System.out.println(player1Stack.size() + " and " + player2Stack.size());
            }
            else if (top2Card.getRank() > top1Card.getRank())
            {
               //player 2 wins war
               System.out.println("Player 2 wins War");
               player1Stack.remove(0);
               player2Stack.remove(0);
               for (int n = 0; n < 6 ; n++)
               {
                  player2Stack.add(WarStash.get(n));
               }
               System.out.println("Player 2 wins");
               System.out.println(player1Stack.size() + " and " + player2Stack.size());
               }
            else
            {
               //same card value, tie
               System.out.println("DRAW");
               //adding player 1's cards back
               player1Stack.remove(0);
               player2Stack.remove(0);
               player1Stack.add(WarStash.get(0));
               player1Stack.add(WarStash.get(2));
               player1Stack.add(WarStash.get(4));
               //adding war cards back to player 2
               player2Stack.add(WarStash.get(1));
               player2Stack.add(WarStash.get(3));
               player2Stack.add(WarStash.get(5));
               //no change in score
               System.out.println(player1Stack.size() + " and " + player2Stack.size());
            }
         }
      }
      //game ends, display winner
      if (player1Stack.size() < 1)
      {
         System.out.println("Player 2 wins the game");
         System.exit(0);
      }
      else if (player2Stack.size() < 1)
      {
         System.out.println("Player 1 win the game");
         System.exit(0);
      }
      else
      {
         //next match of war
         System.out.println("Play again? (yes/no): ");
         input = keyboard.next();
      }
   }//ends else
}
public static void main(String[] args)
{
   War w = new War();
   w.Play();
}
}
