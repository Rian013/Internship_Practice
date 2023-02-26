import java.util.*;
class MultiplicationTable{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n :");
    int n,m;
    n = sc.nextInt();
    int i=1;
    while(i<=10){
      m = n*i;
      if(m%n==0){
      System.out.println(n+"*"+i+"="+(n*i));
      }
      i++;
    }
  }
}