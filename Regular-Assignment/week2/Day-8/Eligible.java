import java.util.Scanner;
class Eligible{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter age: ");
    int age =sc.nextInt();
    if(age>=18){
      System.out.println("yes!the person is Eligible");
    }
    else{
      System.out.println("Ohh!no person is not eligible");
    }
  }
}