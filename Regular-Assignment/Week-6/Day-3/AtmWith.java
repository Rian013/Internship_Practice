interface  ATM{
  
  void withdraw(long account,double amount);
  void deposit(long account,double amount);
  void getbalance(long account);
}
class Operation implements ATM{
  double balance=10000;
  public void withdraw(long account,double amount){
   double balance=10000;
    if(amount<balance)
      System.out.println("Transaction Successful \nBalance="+(balance-amount));
    else
      System.out.println("Unsufficient Balance");
  }
  public void deposit(long account,double amount){
    this.balance=balance-amount;
    System.out.println("Account no:"+account+"\nBalance:"+this.balance);
  }
  public void getbalance(long account){
    this.balance=balance;
    System.out.println("Account no:"+account+"\nBalance:"+this.balance);
  }
}
 
class AtmWith{
  public static void main(String args[]){
    ATM opt=new Operation();
    opt.withdraw(23768374,6000);
    opt.deposit(3246757,6734);
    opt.getbalance(7465845);
  }
}



// import java.util.*;
// interface atm{
//   void withdraw();
//   void deposit();
//   void getBalance();
//   int Ibalance=1500;
// }
// class sbi implements atm{
//   public void withdraw(){
//     System.out.println("Enter how much money do you want to withdraw");
//     Scanner sc = new Scanner(System.in);
//     int wd = sc.nextInt();
//     System.out.println("Take your money = "+ wd);
//     int balance =Ibalance-wd;
//     System.out.println("Balance = "+ balance);
//   }
//   public void deposit(){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter how much u want to deposite");
//     int wd = sc.nextInt();
//      int balance = Ibalance+wd;
//     System.out.println("Your balance is = " + balance);
//   }
//   public void getbalance(){
//  System.out.println(Ibalance);
//    }
// }
// public class Atm{
//   public static void main(String args[]){
//     atm at = new sbi();
//     at.withdraw();
//     at.deposit();
//     at.getBalance();
//   }
// }
 