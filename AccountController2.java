
public class AccountController2
{ 
   private BankReader reader; 

   private BankAccount primaryaccount;
   private BankWriter primarywriter;

   private BankAccount secondaryaccount;
   private BankWriter secondarywriter;

   private BankAccount account;
   private BankWriter writer;
   
   
   public AccountController2(BankReader r, BankAccount a1, BankWriter w1,BankAccount a2, BankWriter w2)
   {  
      reader = r;
      primaryaccount = a1;
      primarywriter = w1;
      secondaryaccount = a2;
      secondarywriter = w2;
      account = primaryaccount;
      writer = primarywriter;
   }
   private void resetAccount(BankAccount newaccount, BankWriter newwriter)
   { 
      writer.showTransaction("Joaktive"); 
      account = newaccount; 
      writer = newwriter;
      writer.showTransaction("Aktive");
   }

   public void processTransactions()
   {
      char command = reader.readCommand("Komanda (P,S,D,W,Q):");
      if ( command == 'Q' ) 
      { }
      else {
         if ( command == 'D' ) 
         {
            int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Depozitim:", amount);
         }
         else if ( command == 'W' ) 
         {
            int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { 
               writer.showTransaction("Terheqje", amount); 
            }
            else { writer.showTransaction("Error", amount); }
         }
         else if ( command == 'P' ) 
         { 
            resetAccount(primaryaccount, primarywriter);
         }
         else if ( command == 'S' ) 
         {
            resetAccount(secondaryaccount, secondarywriter); 
         }
         
         else { writer.showTransaction("Komanda eshte gabim"); }
         this.processTransactions(); 
      }
   }
}