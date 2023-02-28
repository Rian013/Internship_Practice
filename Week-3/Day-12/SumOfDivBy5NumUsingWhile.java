import java.util.*;
class SumOfDivBy5NumUsingWhile{
  public static void main(String args[]){      
    int n,i=1,sum=0;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    
    while(i<=n){ 
      if(i%5==0)
      sum=sum+i;
      i++;
    } 
    System.out.println("Thesum of number div by 5 are : "+sum);
}
}