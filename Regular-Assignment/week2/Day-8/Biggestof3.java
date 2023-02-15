import java.util.*;
class Biggestof3{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int firstNumber,secondNumber,thirdNumber;
     System.out.println("Enter the First number :");
     firstNumber = sc.nextInt();
     System.out.println("Enter the Second number :");
     secondNumber = sc.nextInt();
    System.out.println("Enter the third number :");
     thirdNumber = sc.nextInt();
     if((firstNumber>secondNumber)&&(firstNumber>thirdNumber))
     System.out.println("the first number max");
    
    else if((secondNumber>firstNumber)&&((secondNumber>thirdNumber)))
      System.out.println("The second number is max ");
     else 
      System.out.println("The third number is max");
    
  }
}
    