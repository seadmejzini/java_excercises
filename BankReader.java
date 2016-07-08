import javax.swing.*;
public class BankReader
{ private String inputline; 
   
   public BankReader()
   { inputline = ""; }
   public char readCommand(String message)
   {
      inputline = JOptionPane.showInputDialog(message).trim().toUpperCase();
      return inputline.charAt(0); 
   }
   public int readAmount()
   { int answer = 0;
      String s = inputline.substring(1, inputline.length());
      s = s.trim(); 
      if ( s.length() > 0 )
      { double eurocents = new Double(s).doubleValue();
         answer = (int)(eurocents * 100); 
      }
      else { JOptionPane.showMessageDialog(null, "Error");
      }
      return answer;
   }
}