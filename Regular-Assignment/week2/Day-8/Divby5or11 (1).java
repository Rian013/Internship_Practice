import java.util.Scanner;
public class Divby5or11 {
   public static void main(String[] args){
      int num;
      System.out.println("Enter the number ");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num%5==0)
         System.out.println("the number is divisible by 5");
      else if(num%11==0)
         System.out.println("the number is divisible by 11");
     else
        System.out.println("The number is not divisible");
   }
}