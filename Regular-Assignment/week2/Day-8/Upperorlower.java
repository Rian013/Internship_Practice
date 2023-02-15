
  import java.util.*;
class Upperorlower{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch;
    System.out.println("Enter the character:");
    ch = sc.next().charAt(0);
      if (ch>='A'&&ch<='Z') {
         System.out.println("Character is in Uppercase!");
      }else {
         System.out.println("Character is in Lowercase!");
      }
   }
}
    