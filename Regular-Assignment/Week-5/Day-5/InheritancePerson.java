class Person{
  String name;
  String gender;
  int age;
  String address;
  void print(){
    System.out.println(name+" "+gender+" "+age);
  }
  void printAddress(){
    System.out.println(address);
  }
}
class Student extends Person{
  double sub1,sub2,sub3;
  int id;
  void average(){
    double avg = (sub1+sub2+sub3)/3;
    System.out.printf("The average is %.2f\n: ",+avg);
  }
  void percentage(){
    double per = (sub1+sub2+sub3)/300*100;
  System.out.printf(name+" percentage is %.2f\n ",+per);
     }
}
public class InheritancePerson{
  public static void main(String args[]){
    Student std = new Student();
    std.name="rian";
    std.gender="male";
    std.age=12;
    std.address="near kinnikambla";
    std.sub1=90;
    std.sub2=95;
    std.sub3=99;
    std.id=1234;
    std.print();
    std.printAddress();
    std.average();
    std.percentage();
    }
}