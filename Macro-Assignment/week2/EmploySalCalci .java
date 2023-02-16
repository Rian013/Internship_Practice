import java.util.*;
class  EmploySalCalci{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the salary :");
    double sal,ansal;
    double tax=0;
    double netSalary;
    sal =sc.nextDouble();
    ansal = sal*12;
    System.out.println("Annual salary is :"+ansal);
    if(ansal<300000){
      System.out.println("There is no gst Tax :");
    }
    else if(ansal>=300000&&ansal<600000){
      System.out.println("5% of total tax:");
      tax = ansal*0.5;
      System.out.println("your income after giving tax is "+tax);
    }
    else if(ansal>=600000&&ansal<900000){
      System.out.println("10% of total tax:");
      tax = ansal*0.1;
      System.out.println("your income after giving tax is "+tax);
    }
    else if(ansal>=900000&&ansal<1200000){
      System.out.println("15% of total tax:");
      tax = ansal*0.15;
      System.out.println("your income after giving tax is "+tax);
    }
    else if(ansal>=1200000&&ansal<1500000){
      System.out.println("20% of total tax:");
      tax = ansal*0.2;
      System.out.println("your income after giving tax is "+tax);
    }
    else {
      System.out.println("30% of total tax:");
      tax = ansal*0.3;
      System.out.println("your income after giving tax is "+tax);
    }
    netSalary =ansal-tax;
    System.out.println("net annual salary :"+netSalary);
  }
}