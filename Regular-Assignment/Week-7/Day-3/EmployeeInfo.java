import java.util.ArrayList;


class Employee1{
  private int id;
  private String name;
  private String address;
  private double salary;

  public Employee1(int Id,String name,String address,double salary){
    this.id=id;
    this.name=name;
    this.address=address;
    this.salary=salary;
  }
  public void display(){
    System.out.println("EmpId:"+id);
    System.out.println("EmpName:"+name);
    System.out.println("EmpAddress:"+address);
    System.out.println("EmpSalary:"+salary);
  }
}
public class EmployeeInfo{

  public static void main(String args[]){
    ArrayList<Employee1>empList=new ArrayList<Employee1>();
    Employee1 emp1=new Employee1(1,"ABC","Mumbai",35000.0);
    Employee1 emp2=new Employee1(2,"XYZ","Delhi",40000.0);
    Employee1 emp3=new Employee1(3,"OPQ","Bangalore",38000.0);

    empList.add(emp1);
    empList.add(emp2);
    empList.add(emp3);

    System.out.println("-Employee objects-");
    for(Employee emp:empList){
      emp.display();
      System.out.println();
    }
  }
}
