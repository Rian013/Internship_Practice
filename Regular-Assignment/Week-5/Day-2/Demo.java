import java.util.*;
class Person {
  String name;
  int age;
  String gender;

 

   Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
   void printNameAndAge() {
    System.out.println(name + " is " + age + " years old.");
  }
   void printBirthYear() {
    int birthYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - age;
      System.out.println(name + " was born in " + birthYear + ".");
  }
   void display(){
     System.out.println(name);
     System.out.println(age);
     System.out.println(gender);
   }
}
public class PersonUsingConstructor{
  public static void main(String args[]) {
   Person p = new Person("mubarak",23,"male");
    p.display();
    p.printBirthYear();
  }
}