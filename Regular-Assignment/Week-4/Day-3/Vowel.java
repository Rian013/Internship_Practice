import java.util.*;
class Vowel{
 
  static void checkSubString(String str1,String subString ){
    if(str1.contains(subString)){
      System.out.println(subString.length());
      for(int i=0;i<subString.length();i++){
        if(subString.charAt(i)=='a'||subString.charAt(i)=='e'||subString.charAt(i)=='i'||subString.charAt(i)=='o'||subString.charAt(i)=='u'){
          System.out.print(subString.charAt(i));
          
        }
      }
     
    }
    else{
      System.out.println("invalid");
    }
  }
 
  
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    
    checkSubString("welcome to bitlabs aaaaa","bitlabs aaaa");
    
  }
}