import java.util.*;
class EvenorOdd{
  public static void main(String args[]){      
    int n;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    System.out.println("Even numbers are :");
    for(int i=1;i<=n;i++){  
      if(i%2==0)
      System.out.println(i); 
     
    }
     System.out.println("Odd numbers are :");
       for(int j=1;j<=n;j++)
         if(j%2!=0)
        System.out.println(j);
         
    }
}