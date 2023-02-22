import java.util.*;
class OddNum1Ton{
  public static void main(String args[]){      
    int n;     
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
    System.out.println("Different odd numbers are ");
    for(int i=1;i<=n;i++){  
      if(i%2!=0)
      System.out.println(i);     
    } 
}
}