import java.util.*;
class Split2{
  static void wordsSplit(String str){
   String words[]= str.split(" ");
   for(int i=0;i<words.length;i++){
       System.out.println(words[i]);
   }
    
  }
 
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    wordsSplit("hi how are you");
    
   
    
  }
}