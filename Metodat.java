import java.util.*;
public class Metodat
{
   public String printNoDuplicate(String s)
   {
      String answer = "";
      int l = s.length();
      for (int i = 0; i<l;i++)
      {
         char a = s.charAt(i);
         String b = s.substring(0,i);
         boolean result = checkChar(a,b);
         if (result)
         {
            answer = answer + a; 
         }
      }
      return answer;
   }
   
   private boolean checkChar(char a, String b)
   {
      boolean result  = true;
      
      for(int i = 0; i <b.length();i++ )
      {
         char c = b.charAt(i);
         if (c == a)
         {
            result = false;}
      } 
      return result;
   }
   
   public void firstTab()
   {
      for ( int i = 0; i <= 3; i = i + 1 )
      {             
         for ( int j = 0; j <= i; j = j + 1 )
         
         { 
            System.out.print(i+""+j+" ");
         }
         System.out.println();
      }
   }
   public void secondTab()
   {
      for ( int i = 0; i <= 3; i = i + 1 )
      {             
         for ( int j = 3; j >= i; j = j - 1 )
         
         { 
            System.out.print(i+""+j+" ");
         }
         System.out.println();
      }
   }
   
   public String alphabeticly(String a)
   {
      char[] ch = a.toCharArray();
      Arrays.sort(ch);
      String l = new String(ch);
      return l;
   }
   
   public static void main(String args [])
   {
      String a = new Metodat().printNoDuplicate(" wejk ewjek wej  ");
      System.out.println(a);
      new Metodat().firstTab();
      new Metodat().secondTab();
      String b = new Metodat().alphabeticly("sead");
      System.out.println(b);
   } 
}