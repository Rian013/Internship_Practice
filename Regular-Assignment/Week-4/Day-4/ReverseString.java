import java.util.*;
class ReverseString{
  static void reverse(String s){
    StringBuffer s1 = new StringBuffer();
    s1.append(s);
    s1.reverse();
    System.out.println(s1);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String :");
    String s = sc.nextLine();
    reverse(s);
  }
}