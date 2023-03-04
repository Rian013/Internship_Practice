import java.util.*;
class FormatMethod{
  public static void main(String args[]){
    String name= "Rian";
    String s1 = String.format("name is %s",name);
        String s2 = String.format("value is %f",35.55);
    String s3 = String.format("value is %d",12);
  float n1=23.56f,n2=345.67f;
  float result=n1*n2;
    String result1=String.format("%-15.2f%-15.2f%-15.2f",result,result,result);
    System.out.println(result1);  
  String result2=String.format("%-15.2f%-15.2f%-15.2f",result,result,result);
      System.out.println(result2);
    

    System.out.println(s1);
        System.out.println(s2);
    System.out.println(s3);

  }
}

 
