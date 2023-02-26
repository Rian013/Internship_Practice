import java.util.*;
class ArmstrongNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n Value ");
    int n = sc.nextInt();
    int temp = n;
    int reminder=0,result=0,count=0;
    while(n!=0){
      n=n/10;
      count++;    
      }
    n=temp;
    while(n!=0){
       reminder = n%10;
      result = result + (int)Math.pow(reminder,count);
      n= n/10;
    }
    System.out.println(result);
    if(temp==result){
      System.out.println("it is armstrong num");
    }
    else{
      System.out.println("it is not a armstrong number :");
    }
  }
}