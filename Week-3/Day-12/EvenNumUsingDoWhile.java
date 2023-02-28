import java.util.*;
class EvenNumUsingDoWhile{
  public static void main(String args[]){      
    int n,i=1;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    System.out.println("Different even numbers are ");
    do{  
      if(i%2==0)
      System.out.println(i);  
      i++;
    } 
    while(i<=n);
}
}