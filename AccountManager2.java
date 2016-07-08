
public class AccountManager2
{ 
   public static void main(String[] args)
   { 
      BankReader reader = new BankReader();
      BankAccount primaryaccount = new BankAccount(0);
      BankWriter primarywriter = new BankWriter("Primary Account", primaryaccount,20,20);
      BankAccount secondaryaccount = new BankAccount(0);
      BankWriter secondarywriter = new BankWriter("Secondary Account", secondaryaccount,350,20);
      AccountController2 controller = new AccountController2(reader,primaryaccount, primarywriter, secondaryaccount, secondarywriter);
      controller.processTransactions();
   }
}