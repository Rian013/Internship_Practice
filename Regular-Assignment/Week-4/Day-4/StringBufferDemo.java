import java.util.*;
class StringBufferDemo{
 public static void main(String args[]){
 StringBuffer str=new StringBuffer();
 Scanner sc=new Scanner(System.in);
System.out.println("enter String");
str.append("StringBuffer is a mutable string and we can modify");
 //String str1=str.toString();
 System.out.println(str.lastIndexOf("m"));
   System.out.println(str.insert(44,"not "));
  }
}