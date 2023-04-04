class Person{
  String name;
  int age;
  void print(){
    System.out.println(name+" "+age);
  }
}
class Employee extends Person{
int salary;
  String position;
void display(){
  System.out.println(position+" "+salary);
}
}
class Manager extends Employee{
  int num_ofReports;
  void hire_employee(){
    System.out.println(num_ofReports+1);
  }
  class Engineer extends Employee{
    String specialization;
    void solve_problem(){
      System.out.println("Problem soleved");
    }
  }
}
public class Hybrid{
  public static void main(String args[]){
    Manager std = new Manager();
    std.name="rian";
    std.age=20;
    std.position="Manager";
    std.num_ofReports=9;
    std.salary=1234;
    std.print();
    std.printAddress();
    std.display();
    std.hire_employee();
    
    }
}