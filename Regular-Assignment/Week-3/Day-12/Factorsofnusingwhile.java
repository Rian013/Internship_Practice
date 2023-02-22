import java.util.*;
class Factorsofnusingwhile{
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
        System.out.println("enter the num value :");
        num = sc.nextInt();
        System.out.println( "Factors of " + num + " are " );
        int i = 1;
     while( i <= num/2)
     {
         if(num % i == 0)
             System.out.println(i + " "); 
          i++;
     }

      }
}