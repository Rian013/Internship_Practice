import java.util.*;
class SumOfNum{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int  arr[]=new int[5];
      int sum=0;
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
       System.out.println("*************Sum of Array Elements************");
      for(int j=0;j<5;j++){
        sum = sum +arr[j];
      }
        System.out.println(sum);
    }
}