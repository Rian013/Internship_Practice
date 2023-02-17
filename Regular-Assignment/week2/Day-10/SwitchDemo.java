import java.util.Scanner;
class SwitchDemo{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    switch(num){
      case 10:
        System.out.println("print number 10:");
        break;
        case 20:
        System.out.println("print number 20:");
        break;
        case 30:
        System.out.println("print number 30:");
        break;
        case 40:
        System.out.println("print number 40:");
        break;
        case 50:
        System.out.println("print number 50:");
        break;
      default:
        System.out.println("invalid number :");
        
    }
      
  }
}