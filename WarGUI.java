// GUI for War
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Icon;

public class WarGUI extends JFrame implements ActionListener
{
   private War Play = new War();
   private JPanel topPanel; //background area
   private JButton button; 
   private JLabel player1Stack,player2Stack,player1Card,player2Card;
   private JLabel status;  // game status
   private JLabel title;   // static title
   public WarGUI()
   {
      setLayout(new GridLayout(2,1));
      Play =new War();
      topPanel = new JPanel();
      topPanel.setBackground(Color.orange);
      topPanel.setOpaque(true);
      topPanel = new JPanel(new GridLayout(5,3));
      
      title = new JLabel("Chris Vecchio's War Game");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      //title.setForeGround(Color.RED);
      topPanel.add(title);
         
      status = new JLabel("Game in progress");
      status.setFont(new Font("ARIAL",Font.BOLD,24));
      topPanel.add(status);
      
      button = new JButton("Play round");
      topPanel.add(button);
      button.addActionListener(this);
      
      player1Stack = new JLabel();
      player1Stack.setIcon(new ImageIcon("Cardpics/back.jpg"));
      //player1Stack = new JPanel(new GridLayout(5,3));
      //Image img = player1Stack.getIcon("Cardpics/back.jpg");  
      //Image newimg = img.getScaledInstance(230, 310,java.awt.Image.SCALE_SMOOTH);  
      //player1Stack = new ImageIcon(newimg);        
      topPanel.add(player1Stack);
      add(topPanel);
      
      player1Card = new JLabel();
      player1Card.setIcon(new ImageIcon("Cardpics/back.jpg"));
      topPanel.add(player1Card);
      add(topPanel);
      
      player2Card = new JLabel();
      player2Card.setIcon(new ImageIcon("Cardpics/back.jpg"));
      topPanel.add(player2Card);
      add(topPanel);
      
      player2Stack = new JLabel();
      player2Stack.setIcon(new ImageIcon("Cardpics/back.jpg"));
      topPanel.add(player2Stack);
      add(topPanel);
    
   }
   public void actionPerformed(ActionEvent e)
   {
   if (e.getSource() == button)
      {
      //Play.Play();
      player1Stack.setIcon(new ImageIcon("Cardpics/2c.jpg"));
      player2Stack.setIcon(new ImageIcon("Cardpics/3d.jpg"));
      player1Card.setIcon(new ImageIcon("Cardpics/4d.jpg"));
      player2Card.setIcon(new ImageIcon("Cardpics/5s.jpg"));
      }
   }

   }
   
   