import java.util.*;
class  Temperature{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
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
    
  }
}