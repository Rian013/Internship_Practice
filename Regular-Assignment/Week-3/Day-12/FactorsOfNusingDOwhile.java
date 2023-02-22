import java.util.*;
class FactorsOfNusingDOwhile{
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num=10;
        //System.out.println("enter the num value :");
        //num = sc.nextInt();
        System.out.println( "Factors of " + num + " are " );
        int i = 1;
     do
     {
         if(num % i == 0)
             System.out.println(i + " "); 
          i++;
     }
    while( i <= num/2);
      }
}