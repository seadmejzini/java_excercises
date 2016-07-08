import java.awt.*;
import javax.swing.*;
import java.text.*;
public class BankWriter extends JPanel
{private int width = 300; 
   private int height = 200;
   private BankAccount bank; 
   private String lasttransaction = "";
   public BankWriter(String title, BankAccount b,int x,int y)
   { 
      bank = b;
      JFrame myframe = new JFrame();
      myframe.getContentPane().add(this);
      myframe.setTitle(title);
      myframe.setLocation(x,y);
      myframe.setSize(width, height);
      myframe.setVisible(true);
   }
   public void paintComponent(Graphics g)
   { 
      g.setColor(Color.white);
      g.fillRect(0, 0, width, height);
      g.setColor(Color.black);
      int textmargin = 50;
      int textbaseline = 50;
      g.drawString(lasttransaction, textmargin, textbaseline);
      g.drawString("Shuma momentale = " + unconvert(bank.getBalance()),textmargin, textbaseline + 20);
   }

   private String unconvert(int i)
   { double eurocents = i / 100.00;
      return new DecimalFormat("0.00").format(eurocents);
   }

   public void showTransaction(String message, int amount)
   { lasttransaction = message + " " + unconvert(amount);
      this.repaint();
   }

   public void showTransaction(String message)
   { lasttransaction = message;
      this.repaint();
   }
}