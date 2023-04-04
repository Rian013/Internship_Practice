import java.util.*;
class Employee{
  private String name,position,address;
  private int id;
  Employee(String name,String position,String address,int id){
    this.name=name;
    this.position=position;
    this.address=address;
    this.id=id;
  }
  String getName(){
    return name;
  }
  String getPosition(){
    return position;
  }
  String getAddress(){
    return address;
  }
  int getId(){
    return id;
  }
}
  public class EmployeeList{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      ArrayList<Employee> emp = new ArrayList<Employee>();
      for(int i=0;i<3;i++){
        emp.add(new Employee(sc.next(),sc.next(),sc.next(),sc.nextInt()));
      }
      for(Employee e:emp){
        System.out.println(e.getName()+" "+e.getPosition()+" "+e.getAddress()+" "+e.getId());
      }
    }
  }
