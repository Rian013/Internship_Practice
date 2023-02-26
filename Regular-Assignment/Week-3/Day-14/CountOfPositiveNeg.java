import java.util.*;
class CountOfPositiveNeg{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int  arr[]=new int[5];
      int sum=0;
      int count =0,temp=0;
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
       System.out.println("*************Count of Positive and negative  Array Elements************");
      for(int j=0;j<5;j++){
      if(arr[j]>0){
        System.out.println(arr[j]);
        count++;
      }
        else if(arr[j]<0){
          System.out.println(arr[j]);
          temp++;
          
        }
      }
     System.out.println("the count of positive number is :"+count);
      System.out.println("the count of negative number is :"+temp);
    }
}