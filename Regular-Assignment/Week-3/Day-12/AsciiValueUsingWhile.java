import java.util.*;
class AsciiValueUsingWhile{
  public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Different Asii values  are ");
    char ch ='a';
     while(ch<='z'){  
      System.out.println((int)ch);
       ch++;
    } 
}
}