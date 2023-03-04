//WithReturnWithParameter
import java.util.Scanner;
class BigOf2FourthWay{
  static int maxNum(int a,int b){
   
    if(a>b){
    return a;
    }
    else{
      return b;
    }
  }
  public static void main(String args[]){
      int max= BigOf2FourthWay.maxNum(20,12);
    System.out.println(max);
  }
}