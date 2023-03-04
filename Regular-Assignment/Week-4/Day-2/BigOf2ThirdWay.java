//WithReturnWithoutParameter
import java.util.Scanner;
class BigOf2ThirdWay{
  static int maxNum(){
    int a,b;
    a=30;b=20;
    if(a>b){
    return a;
    }
    else{
      return b;
    }
  }
  public static void main(String args[]){
      int max= BigOf2ThirdWay.maxNum();
    System.out.println(max);
  }
}