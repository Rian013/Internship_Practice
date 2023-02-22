import java.util.*;
class DivBy5UsingWhile{
  public static void main(String args[]){      
    int n,i=1;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    System.out.println("The number divisbile by 5 are ");
    while(i<=n){  
      if(i%5==0)
      System.out.println(i);  
      i++;
    } 
}
}