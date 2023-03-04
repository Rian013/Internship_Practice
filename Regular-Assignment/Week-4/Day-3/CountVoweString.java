import java.util.*;
class CountVoweString{
 
  static void convert(String str1){
           char  ar[]=str1.toCharArray();
    int count=0;
    for(int i=0;i<ar.length;i++){
     if(ar[i]=='a'||ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u'){
       System.out.println(ar[i]);
       count++;
     }
    }
    System.out.println(count);
   
  }
 
  
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    
    convert("Lalitha.ujjaneni@gmail@.con");
    
  }
}