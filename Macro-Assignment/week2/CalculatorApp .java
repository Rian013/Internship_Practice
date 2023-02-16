import java.util.*;
class CalculatorApp{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the type of operation u want to perform :");
    String oper = sc.next();
    double a,b,ans=0;
    System.out.println("Enter input a");
    a= sc.nextDouble();
    System.out.println("Enter input b");
    b = sc.nextDouble();
     if(oper.equals("+")){
       ans = a+b;
       }
   else if(oper.equals("-")){
       ans = a-b;
       }
    else if(oper.equals("*")){
       ans = a*b;
       }
    else if(oper.equals("/")){
      if(b==0){
       System.out.println("cannot be divided by 0");
      }else{
        ans = a/b;
      }
       }
    else{
      System.out.println("Invalid operator");
    }
    System.out.println("The calculated value is"+ans);
    }
}