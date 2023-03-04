import java.util.*;
  class Palindrome{
 
  static String revereseString(String str){
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    return rev;
  }
  
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    
   String reverse=revereseString("madam");
    if(reverse.equals("madam")){
      System.out.println("palindrome");
        
    }
    else{
       System.out.println("not a palindrome");
        
    }
    
  }
}
 