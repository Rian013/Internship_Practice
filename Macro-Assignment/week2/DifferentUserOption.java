import java.util.Scanner;
import java.util.Random;
class DifferentUserOption{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     Random randI = new Random();
    double a,b,ans=0;
    int rand,chooce,sel;
    char oper;
    System.out.println("Please Choose any one option from below");
    System.out.println("1.Mathamatical operation \n 2.Unit Conversions \n 3.Random number between(1-100) \n 4.Good bye message");
    chooce =sc.nextInt();
    switch(chooce){
      case 1:
        System.out.println("Enter input a");
    a= sc.nextDouble();
    System.out.println("Enter input b");
    b = sc.nextDouble();
    System.out.println("1.'a'for addition \n 2.'b'for Subtraction \n 3.'c'for multiplication \n 4.'d'for division");
         System.out.println("Enter the type of operation u want to perform :");
    oper = sc.next().charAt(0);
    switch(oper){
      case  'a':
        ans =a+b;
        System.out.println(ans);
        break;
        case 'b':
        ans =a-b;
        System.out.println(ans);
        break;
        case 'c':
        ans =a*b;
        System.out.println(ans);
        break;
        case 'd':
        if(b==0){
          System.out.println("cannot be divide by 0");
        }else{
        ans =a/b;
        System.out.println(ans);
        }
        break;
        
      default:
        System.out.println("invalid");
    }
        break;
      case 2:
        System.out.println("Select the what type of conversion you want to do :");
        System.out.println("1.Temperature converter 2.Distance converter");
        sel = sc.nextInt();
        switch(sel){
          case 1:
             System.out.println("Enter the temperature :");
    double inp = sc.nextDouble();
    System.out.println("Enter c for celcius :");
    System.out.println("Enter f for farhenite :");
    String convert = sc.next();
    double c,f;
    if(convert.equals("c")){
      c=((inp-32)*5/9);
      System.out.println("celsius temperature is :"+c );
      }
    else if(convert.equals("f")) {
      f =(inp*9/5)+32;
      System.out.println("fahrenite temperture is :"+f);
      }
    else{
      System.out.println("print invalid :");
    }
            break;
          case 2:
            System.out.println("Please Enter Distance in Kilometer or miles :");
            int dis = sc.nextInt();
            System.out.println("Enter 'k' for miles to kilometer conversion  :");
            System.out.println("Enter 'm' for kilometer to miles conversion  :");
            char korm = sc.next().charAt(0);
            double m,k;
            if(korm=='m'){
              m = dis/1.6;
              System.out.println("The miles obtained is "+m);
            }
            else if(korm=='k'){
              k = dis*1.6;
              System.out.println(k+"km");
            }
            else{
              System.out.println("invalid");
            }
            break;
          default:
            System.out.println("invalid");
        }
        break;
          case 3:
            rand = randI.nextInt(100);
            System.out.println("Random number is: "+rand);
            break;
          case 4:
            System.out.println("Good Bye,Have a wonderfull Day ");
        break;
          default:
            System.out.println("Select Responsibly :");
            
           }
        

   }
}
