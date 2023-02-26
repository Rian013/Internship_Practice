import java.util.*;
class SumOfEvenNum{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int  arr[]=new int[5];
      int sum = 0;
     System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
       System.out.println("*************Sum of Even Array Elements************");
      System.out.println("Even Numbers are :");
      for(int j=0;j<5;j++){
        if(arr[j]%2==0){
        System.out.println(arr[j]);
          sum = sum + arr[j];
        }    
      }
      System.out.println("The sum of even num is :"+sum);
    }
}