class Employee{
  private int eid;
  private  String name;
  private double hra;
  private double da;
  void setEid(int eid){
    this.eid = eid;
  }
  void setName(String name){
    this.name = name;
  }
  void setHra(double hra){
    this.hra=hra;
  }
  void setDa(double da){
    this.da = da;
  }
  int getEid(){
    return eid;
  }
  String getName(){
    return name;
  }
  double getHra(){
    return hra;
  }
  double getDa(){
    return da;
  }
  
  
}
class Accountant extends Employee{
  private String depart;
  private double salary;
    void setDepart(String depart){
    this.depart = depart;
  }
    void setSalary(double salary){
    this.salary = salary;
  }
      String getDepart(){
    return this.depart;
  }
    double  setSalary(){
    return this.salary;
  }
  void grossSalary(){
    double grossSal = this.salary+getHra()+getDa();
    system.out.println(grossSal);
 }
  }
class manager extends Employee{
  private String typeOfManager;
  private double salary;
  void setTypeOfManager(String typeOfManager){
    this.typeOfManager=typeOfManager;
  }
  void setSalary(double salary){
    this.salary=salary;
  }
  void getTypeOfManager
}

























// import java.util.Scanner; class Employee1 {     private int eid;

//     private String ename;

//     private double hra, da;     public int getEid() {

//         return eid;

//     }     public void setEid(int eid) {

//         this.eid = eid;

//     }     public String getEname() {

//         return ename;

//     }     public void setEname(String ename) {

//         this.ename = ename;

//     }     public double getHRA() {

//         return hra;

//     }     public double getDA() {

//         return da;

//     }     public void setHRAandDA(double hra, double da) {

//         this.hra = hra;

//         this.da = da;

//     }

// } class Accountant extends Employee1 {

//     private String dept;

//     private double salary;     Scanner s = new Scanner(System.in);     public void setDetails() {

//         System.out.println("Enter Employee id");

//         setEid(s.nextInt());         System.out.println("Enter Employee name");

//         setEname(s.next());

//         System.out.println("Enter Employee department");

//         dept = s.next();

//         System.out.println("Enter Employee salary");

//         salary = s.nextInt();         System.out.println("Enter HRA");

//         int hra = s.nextInt();

//         System.out.println("Enter DA");

//         int da = s.nextInt();

//         setHRAandDA(hra, da);

//     }     public void getDetails() {

//         System.out.println("Enter Employee id " + getEid());

//         System.out.println("Enter Employee name " + getEname());

//         System.out.println("Enter Employee department " + dept);

//         System.out.println("Enter Employee salry " + salary);

//     }     double grossSalary() {

//         double grossSalary = salary + getHRA() + getDA();

//         return grossSalary;

//     }

// } class Manager extends Employee1 {

//     private String type;

//     private double salary;     Scanner s = new Scanner(System.in);     public void setDetails() {

//         System.out.println("Enter Employee id");

//         setEid(s.nextInt());         System.out.println("Enter Employee name");

//         setEname(s.next());

//         System.out.println("Enter Manager type");

//         type = s.next();

//         System.out.println("Enter Employee Salary");

//         salary = s.nextInt();         System.out.println("Enter HRA");

//         int hra = s.nextInt();

//         System.out.println("Enter DA");

//         int da = s.nextInt();

//         setHRAandDA(hra, da);

//     }     public void getDetails() {

//         System.out.println("Enter Employee id " + getEid());

//         System.out.println("Enter Employee name " + getEname());

//         System.out.println("Enter Employee type " + type);

//         System.out.println("Enter Employee salry " + salary);

//     }     double grossSalary() {

//         double grossSalary = salary + getHRA() + getDA();

//         return grossSalary;

//     }

// } public class EmployeeDetails1 {

//     public static void main(String args[]) {

//         Manager man = new Manager();

//         Accountant ac = new Accountant();         ac.setDetails();

//         double gross = ac.grossSalary();

//         System.out.println("gross salary is " + gross);         man.setDetails();

//         double gros = man.grossSalary();

//         System.out.println("gross salary is " + gros);

//     }

// }