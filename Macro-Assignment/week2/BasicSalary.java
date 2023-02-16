import java.util.*;
class BasicSalary{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double basicSalary,hra,da,grossSalary;
    System.out.println("Basic salary: ");
    basicSalary =sc.nextDouble();
    if (basicSalary<= 10000 ){
      hra = basicSalary*0.2;
      System.out.println("hra is:"+hra);
      da = basicSalary*0.8;
      System.out.println("da is: "+da);
      grossSalary = basicSalary+hra+da;
      System.out.println("Gross Salary is :"+grossSalary);
       }
     else if (basicSalary<= 20000 && basicSalary>10000){
      hra = basicSalary*0.25;
      System.out.println("hra is:"+hra);
      da = basicSalary*0.9;
      System.out.println("da is: "+da);
      grossSalary = basicSalary+hra+da;
      System.out.println("Gross Salary is :"+grossSalary);
       }
     else{
      hra = basicSalary*0.3;
      System.out.println("hra is:"+hra);
      da = basicSalary*0.95;
      System.out.println("da is: "+da);
      grossSalary = basicSalary+hra+da;
      System.out.println("Gross Salary is :"+grossSalary);
       }
    
  }
}