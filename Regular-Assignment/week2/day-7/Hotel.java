import java.util.Scanner;
class Hotel{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Room rate");
    int num1=sc.nextInt();
    System.out.println("number of nights staying");
    int num2=sc.nextInt();
    
    int total=num1*num2;
    System.out.println("Total cost= "+total);
  }
}