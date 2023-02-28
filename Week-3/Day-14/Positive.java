import java.util.*;
class Positive{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int  arr[]=new int[5];
      int sum=0;
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
       System.out.println("*************positive numbers of Array Elements************");
      for(int i=0;i<5;i++){
      if(arr[i]>0){
        System.out.println(arr[i]);
      }
      }
    }
}