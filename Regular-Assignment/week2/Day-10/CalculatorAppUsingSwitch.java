import java.util.*;
class CalculatorAppUsingSwitch{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    double a,b,ans=0;
    System.out.println("Enter input a");
    a= sc.nextDouble();
    System.out.println("Enter input b");
    b = sc.nextDouble();
     System.out.println("Enter the type of operation u want to perform :");
    char oper = sc.next().charAt(0);
    switch(oper){
      case  '+':
        ans =a+b;
        break;
        case '-':
        ans =a-b;
        break;
        case '*':
        ans =a*b;
        break;
        case '/':
        if(b==0){
          System.out.println("cannot be divide by 0");
        }else{
        ans =a/b;
        }
        break;
        case '%':
        ans =a%b;
        break;
      default:
        System.out.println("invalid");
    }
    System.out.println(ans);
  }
}
    