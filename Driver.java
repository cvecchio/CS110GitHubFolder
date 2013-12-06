//Chris Vecchio
//GUI Driver
//CS110
import javax.swing.*;

public class Driver
{
   public static void main(String [] args)
   {
      JFrame frame = new WarGUI();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(700,700); //set window size
      frame.validate();
      frame.setVisible(true);
   }
}