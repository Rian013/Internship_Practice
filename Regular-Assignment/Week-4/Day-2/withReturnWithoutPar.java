import java.util.Scanner;
class withReturnWithoutPar{
  static int sum(){
    int a,b;
    a=10;b=20;
    
    return a+b;
  }
  public static void main(String args[]){
      int sum= withReturnWithoutPar.sum();
    System.out.println(sum);
  }
}