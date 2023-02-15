import java.util.Scanner;
class Restaurent{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Cost of the food:");
    int num1=sc.nextInt();
    System.out.println("tax");
    float tax =num1*18/100;
    System.out.println(tax);
    System.out.println("tip");
    int num3=sc.nextInt();
    int total=num1+num3+tax;
    System.out.println("Total cost "+total);
    
  }

@Override
public String toString() {
	return "Restaurent []";
}
}