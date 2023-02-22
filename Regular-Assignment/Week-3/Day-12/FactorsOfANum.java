import java.util.*;
class FactorsOfANum{
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
        System.out.println("enter the num value :");
        num = sc.nextInt();

     System.out.println( "Factors of " + num + " are " );
     for(int i = 1; i <= num/2; i++)
     {
         if(num % i == 0)
             System.out.println(i + " "); 
     }

      }
}
 