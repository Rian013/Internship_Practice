import java.util.*;
class SumOfNEvenNum{
  public static void main(String args[]){      
    int n,sum=0;   
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();
  
    // for(int i=1;i<=n;i++){  
      //if(i%2==0)
    for(int i=0;i<=n;i=i+2){
        sum=sum+i;
      
    } 
    System.out.println("The sum of n even number is:"+sum);
}
}