import java.util.*;
class MultiplicationTableUsingWhile{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n :");
    int n;
    n = sc.nextInt();
    int i=1;
    while(i<=10){
      System.out.println(n+"*"+i+"="+(n*i));
      i++;
    }
  }
}