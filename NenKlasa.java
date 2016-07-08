import javax.swing.*;
public class NenKlasa
{

 //This method calculates the N! for every pozitiv integer
   public long fa(int i)
   {
      long faktorielanswer = 1;
      int x = 1;
      if (i<0)
      {
         JOptionPane.showMessageDialog(null,"The number must be positive");
      }
      else if (i == 0)
      {faktorielanswer = 1;}
      while(x<=i)
      {
         faktorielanswer = faktorielanswer*x;
         x++;
      }
      return faktorielanswer;
   }
   
 
   
   //This method calculates the sum of the first i natural numbers
   public int summation(int i)
   {
      int summationanswer = 0;
      int y = 0;
      if (i<0)
      {
         while(i<=0)
         {
            summationanswer = summationanswer + i;
            i++; 
         }
      }
      else if (i==0)
      {
         summationanswer = 0;
      }
      else
      {
         while (y<=i)
         {
            summationanswer = summationanswer + y;
            y++;
         }
      }
      return summationanswer;
   }
   

   
   //This method calculates the product of all integers betwen a and b.
   
   public int product(int a,int b)
   {   
      int productanswer = 1;
      int f; 
      if(a == b){f = 1;}
      else if (a == 0|| b==0 ){f = 2;}
      else if ((a<0&&b<0)&&(a<b)){ f = 3;}
      else if ((a<0&&b<0)&&(b<a)){ f = 4;}
      else if ((a>0&&b>0)&&(a<b)){ f = 5;}
      else { f = 6;}
      
      switch(f){
         case 1: 
            {
               productanswer = a;
               break;
            }
         
         case 2:  
            {
            
               productanswer = 0;
               break;
            }
         case 3:
            {
               while (a <= b)
               {
                  productanswer = productanswer*a;
                  a++;
               }
            }
         case 4:
            {
               while (b <= a)
               {
                  productanswer = productanswer*b;
                  b++;
               }
            }
         
         case 5:
            {
               while (a <= b)
               {
                  productanswer = productanswer*a;
                  a++;
               }  
            }
         case 6:
            {
               while (b <= a)
               {
                  productanswer = productanswer*b;
                  b++;
               }  
            }
      }
      return productanswer;
   }
   
  
   public static void main (String args [])
   {
      NenKlasa b = new NenKlasa();
      int l = new Integer(JOptionPane.showInputDialog("Type the number you want to know its faktoriel")).intValue();
      int k = new Integer(JOptionPane.showInputDialog("Type the number you want to know the sum of its inheritors")).intValue();
      int p = new Integer(JOptionPane.showInputDialog("Type the first numberof product ")).intValue();
      int q = new Integer(JOptionPane.showInputDialog("Type the last number of product")).intValue();
      long a = b.fa(l);
      int c = b.summation(k);
      int d = b.product(p,q);
      JOptionPane.showMessageDialog(null,"The faktoriel of number" + l + "is:\n" + a);
      JOptionPane.showMessageDialog(null,"Sum of" + k + "first numbers is:" + c);
      JOptionPane.showMessageDialog(null,"The product of all numbers between" + p + "and" + q + "is:" + d);
   }
}