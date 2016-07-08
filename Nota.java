import javax.swing.*;
public class Nota
{
   public static void main(String args[])
   {
      int nota = new Integer(JOptionPane.showInputDialog("Type your points:")).intValue();
      int mesatarja =(int) nota/10;
      char m = 'A';
      switch (mesatarja)
      {
         case 10: 
            { m = m;
               String answer = " Your grade is: " + m;
               JOptionPane.showMessageDialog(null,answer);
               break;
            } 
         case 9: 
            { m = m;
               String answer = " Your grade is: " + m;
               JOptionPane.showMessageDialog(null,answer);
               break;
            }
         case 8: 
            { m = 'B';
               String answer = " Your grade is: " + m;
               JOptionPane.showMessageDialog(null,answer);
               break;
            }
         case 7: 
            { m = 'C';
               String answer = " Your grade is: " + m;
               JOptionPane.showMessageDialog(null,answer);
               break;
            }
         case 6: 
            { m = 'D';
               String answer = " Your grade is: " + m;
               JOptionPane.showMessageDialog(null,answer);
               break;
            }
         
         default: 
            { 
               m = 'F';
               String answer = " Your grade is: " + m;
               JOptionPane.showMessageDialog(null,answer); 
            }
            
      }
   
   }
}