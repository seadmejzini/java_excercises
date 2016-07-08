import javax.swing.*;
public class BankAccount

{ private int balance; 
   public BankAccount(int initialamount)
   { 
      if ( initialamount >= 0 )
      { balance = initialamount; }
      else { balance = 0; }
   }
   public boolean deposit(int amount)
   { boolean result = false;
      if ( amount >= 0 )
      { balance = balance + amount;
         result = true;
      }
      else { JOptionPane.showMessageDialog(null,"Error");
      }
      return result;
   }

   public boolean withdraw(int amount)
   { boolean result = false;
      if ( amount < 0 )
      { JOptionPane.showMessageDialog(null,"Error"); }
      else if ( amount > balance )
      { JOptionPane.showMessageDialog(null,"Error");
      }
      else { balance = balance - amount;
         result = true;
      }
      return result;
   }
   public int getBalance()
   { 
      return balance; }
}