import java.util.*;
class EvenOrOddUsingWhile{
  public static void main(String args[]){      
    int n;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    System.out.println("Even numbers are :");
    int i=1,j=1;
     while(i<=n){  
      if(i%2==0)
      System.out.println(i);
       i++;
         }
     System.out.println("Odd numbers are :");
        while(j<=n){
         if(j%2!=0)
        System.out.println(j);
         j++;
        }
    }
}