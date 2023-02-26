import java.util.*;
class PerfectNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int sum =0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0)
        sum = sum+i;
    }
    System.out.println("the sum of factors : "+sum);
    if(sum==n){
      System.out.println("It is a Perfect Num : ");
    }
      else {
      System.out.println("it is not a perfect number");
    }
  }
}