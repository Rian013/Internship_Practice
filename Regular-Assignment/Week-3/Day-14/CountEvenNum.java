import java.util.*;
class CountEvenNum{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int  arr[]=new int[5];
      int count =0;
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
       System.out.println("*************Even Array Elements************");
      System.out.println("Even Numbers are :");
      for(int i=0;i<5;i++){
        if(arr[i]%2==0){
        System.out.println(arr[i]);
      count++;
        }
      }
     System.out.println("The count of even num is "+count);
}
}