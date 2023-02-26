import java.util.*;
class EvenOrNotUsingArray{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int  arr[]=new int[5];
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
       System.out.println("*************Array Elements************");
      System.out.println("Even Numbers are :");
      for(int j=0;j<5;j++)
        if(arr[j]%2==0)
        System.out.println(arr[j]);
    }
}