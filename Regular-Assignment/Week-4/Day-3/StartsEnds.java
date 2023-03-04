import java.util.*;
class StartsEnds{
 
  static void validString(String str){
    if(str.startsWith("w")&&str.endsWith("s")){
      System.out.println("Valid");
    }
    else{
      System.out.println("Not valid");
    }
  }
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    
    validString("welcome to bitlabs");
    
  }
}