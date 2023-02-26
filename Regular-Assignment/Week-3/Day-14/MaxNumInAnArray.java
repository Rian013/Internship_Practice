import java.util.*;
class MaxNumInAnArray{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int  arr[]=new int[n];
      int sum=0;
      System.out.println("Enter the values");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
       int max = arr[0];
       System.out.println("*************Max number  of Array Elements************");
      for(int i=0;i<n;i++){
      if(arr[i]>max){
        max = arr[i];
      }
        }
      System.out.println(max);
    }
}