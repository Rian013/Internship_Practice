import java.util.*;
class AsciiValue{
  public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
       
    System.out.println("Ascii values for Capital A-Z are Different alphabets are ");
    for(char ch='A';ch<='Z';ch++){  
      System.out.println((int)ch);     
    } 
     System.out.println("Ascii values for small a are Different alphabets are ");
    for(char c='a';c<='z';c++){
      System.out.println((int)c);
    }
}
}