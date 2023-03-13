// Create a class called BankAccount with attributes balance and interest_rate. Create two subclasses, CheckingAccount and SavingsAccount, that both inherit from BankAccount. Add an attribute transaction_fee to CheckingAccount and an attribute min_balance to SavingsAccount. Create a method in CheckingAccount called withdraw() that subtracts an amount from the balance and also subtracts the transaction fee. Create a method in SavingsAccount called add_interest() that adds interest to the balance.


import java.util.*;
class BankAccount{
  double balance=50000;
  float intrestRate=10.00f;
  
}
class SavingsAccount extends BankAccount{
  double minBalance=500;
  Scanner sc = new Scanner(System.in);
    void withRaw(){
   while(true){
      System.out.println("Enter the Amout");
      double a = sc.nextDouble();
     double balance1 = balance-a;
    if(balance1>=minBalance){
      System.out.println("Balance is "+balance1);
      break;
    }
      else{
        System.out.println("Amount must be greater than minimum balance");
      }
    
   }
  }
}
public class Bank2{
  public static void main(String args[]){
    SavingsAccount vh = new SavingsAccount();
    vh.withRaw();
    
  }
}