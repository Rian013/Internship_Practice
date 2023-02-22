import java.util.*;
class SumOfEvenNumUsingWhile{
  public static void main(String args[]){      
    int n,sum=0;   
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    int i=0;
     while(i<=n){
        sum=sum+i;
      i=i+2;
    } 
    System.out.println("The sum of n even number is:"+sum);
}
}