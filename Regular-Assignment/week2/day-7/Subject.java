import java.util.Scanner;
class Subject{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("3 subjects");
    System.out.println("sub 1");
    int num1=sc.nextInt();
    System.out.println("sub 2");
    int num2=sc.nextInt();
    System.out.println("sub 3");
    int num3=sc.nextInt();
    
    int average= (num1+num2+num3)/3;
    System.out.println("Average of 3 subjets "+average);
  }
}