import java.util.*;
class BankAccount
{
    private double balance;
    //constructor to initialize balance
    public BankAccount(double initialbal)
    {
        this.balance=initialbal;
    }
    public String deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            return "Successfully deposited "+amount+".\nCurrent balance:"+balance;
        }
        return "Invalid deposit amount.";
    }
    public String withdraw(double amount)
    {
      if(amount>balance)
      {
          return "Insufficient balance";
      }
      else if(amount>0)
      {
          balance-=amount;
          return "Successfully withdrawn "+amount+".\nCurrent balance: "+balance;
      }
      return "Invalid withdrawal amount.";
    }
    public String checkbalance()
    {
       return "Your current balance is:"+balance;
    } 
}
public class atm 
{
    private BankAccount account;
    public atm(BankAccount account)
    {
        this.account=account;
    }
    public void showmenu()
    {
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while(!exit)
        {
            System.out.println("\n Welcome to the ATM ");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Choose an option:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println(account.checkbalance());
                       break;
                case 2:System.out.println("Enter amount to deposit:");
                       double depositamount=sc.nextDouble();
                       System.out.println(account.deposit(depositamount));
                       break;
                case 3:System.out.println("Enter amount to withdraw:");
                       double withdrawamount=sc.nextDouble();
                       System.out.println(account.withdraw(withdrawamount));
                       break;
                case 4:System.out.println("Thankyou for using the ATM!!");
                       exit=true;
                       break;
                default:System.out.println("Invalid choice.\nplease try again.");
            }
        }
        sc.close();
    }
    public static void main(String[] args) 
    {
       BankAccount user=new BankAccount(500);//initial balance
       atm atm=new atm(user);
       atm.showmenu(); 
    }
    
}
