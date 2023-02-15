import java.util.*;
class MaxNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int firstNumber,secondNumber;
    System.out.println("Enter the First number :");
     firstNumber = sc.nextInt();
    System.out.println("Enter the Second number :");
     secondNumber = sc.nextInt();
    if(firstNumber>secondNumber){
      System.out.println("the first number max");
    }
    else{
      System.out.println("The second number is max ");
    }
  }
}