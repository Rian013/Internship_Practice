import java.util.*;
class SumOfOddNumUsingWhile{
  public static void main(String args[]){      
    int n,sum=0;   
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    int i=1;
     while(i<=n){
        sum=sum+i;
      i=i+2;
    } 
    System.out.println("The sum of n even number is:"+sum);
}
}