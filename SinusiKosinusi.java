import javax.swing.*;
import java.text.*;
public class SinusiKosinusi
{
   public SinusiKosinusi()
   {}
   NenKlasa b = new NenKlasa();
   
   public double sin(double d)
   {
      double sin;
      sin = d - (Math.pow(d,3)/b.fa(3)) +
         (Math.pow(d,5)/b.fa(5)) -
         (Math.pow(d,7)/b.fa(7)) +
         (Math.pow(d,9)/b.fa(9)); 
      return sin;
   }
     
   public double cos(double f)
   {
      double cos;
      cos = f - (Math.pow(f,2)/b.fa(2))+ 
         (Math.pow(f,4)/b.fa(4)) -
         (Math.pow(f,6)/b.fa(6)) +
         (Math.pow(f,8)/b.fa(8)) -
         (Math.pow(f,10)/b.fa(10)); 
      return cos;
   } 
   public static void main (String args [])
   {
      SinusiKosinusi h = new SinusiKosinusi();
      DecimalFormat f = new DecimalFormat("0.000");
      double k = h.sin(Math.PI/3);
      double k1 = h.cos(Math.PI/3);
      String m = f.format(k);
      String n = f.format(k1);
      System.out.println("Sinusi i nr:Math.PI/3 , eshte: "+m);
      System.out.println("Kosinusi i nr:Math.PI/3 , eshte"+n);
   }
}