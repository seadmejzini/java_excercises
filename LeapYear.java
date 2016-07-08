import javax.swing.*;
public class LeapYear
{
   public static void main(String args[])
   {
      String answer = "";
      int year = new Integer(JOptionPane.showInputDialog("Type the year!")).intValue();
      int a = -1;//The year is not a leap year if a ==-1;
      
      if ((year%4)!=0) 
      {
         a = a;
      }
      else if ((year%100)!=0)
      {
         a = -a;
      }
      
      else if ((year%400)!=0)
      {
         a = a;
      }
      
      else
      {
         a = -a;
      }
      
      if (a == -1)
      {
         answer = ", is not a leap year";
      }
      else
      {answer = ", is a leap year";}
      
      
      answer  = "The year: " + year + answer;
      JOptionPane.showMessageDialog(null,answer);
   }
}