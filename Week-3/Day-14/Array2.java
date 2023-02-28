import java.util.*;
class Array2{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      double arr[]=new double[5];
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.nextDouble();
       System.out.println("*************Array Elements************");
      for(int j=0;j<5;j++)
        System.out.println("arr["+j+"]= "+arr[j]);
    }
}