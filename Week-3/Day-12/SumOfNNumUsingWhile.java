import java.util.*;
class SumOfNNumUsingWhile {    
  public static void main(String args[]){      
    int n,sum=0;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();  
    int i=1;
    while(i<=n){ 
      sum=sum+i;
      i++;
    }      
     System.out.println("The sum of n natural number is "+sum); 
  } 
}