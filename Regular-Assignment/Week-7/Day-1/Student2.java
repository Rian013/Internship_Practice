import java.util.*;
class StudentMain{
  private int rollNo;
  private String name;
  private String dept;
  private char section;

  void setRollno(int rollNo){
    this.rollNo=rollNo;
  }
  void setName(String name){
    this.name = name;
  }
  void setDept(String dept){
    this.dept= dept;
  }
    void setSection(char section){
      this.section = section;
    }
   int getRollno(){
   return this.rollNo;
  }
  String getName(){
    return this.name;
  }
  String getDept(){
     return this.dept;
  }
    char getSection(){
      return this.section;
    }
  
  }
public class Student2{
  public static void main(String args[]){
    StudentMain s[] = new StudentMain[5];
    Scanner sc = new Scanner(System.in);
   for(int i=0;i<5;i++){
     s[i]=new StudentMain();
     System.out.println("enter student "+(i+1)+" details");
     System.out.println("enter name ");
     String a = sc.next();
     s[i].setName(a);
     System.out.println("Enter the roll no.");
     int b = sc.nextInt();
     s[i].setRollno(b);
     System.out.println("enter the department ");
     String c = sc.next();
     s[i].setDept(c);
    System.out.println("Enter the section");
     char d = sc.next().charAt(0);
     s[i].setSection(d);
   
     }
    for(int i=0;i<5;i++){
      System.out.println("Roll no:"+s[i].getRollno());
      System.out.println("Name:"+s[i].getName());
       System.out.println("section"+s[i].getSection());
       System.out.println("dept "+s[i].getDept());
    }
  }
}