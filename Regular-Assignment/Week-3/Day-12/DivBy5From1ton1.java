import java.util.*;
class DivBy5From1ton1{
  public static void main(String args[]){      
    int n;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    System.out.println("Different  numbers that are div by 5 are ");
    for(int i=1;i<=n;i++){  
      if(i%5==0)
      System.out.println(i);     
    } 
}
}