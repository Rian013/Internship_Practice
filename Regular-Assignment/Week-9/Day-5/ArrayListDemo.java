mport java.util.ArrayList;

class Student{
  int id;
  String name;
  String city;
  int year;

  Student(int id,String name,String city,int year){
    this.id=id;
    this.name=name;
    this.city=city;
    this.year=year;
  }
}
class ArrayListDemo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 student Information");
    ArrayList<Student>st=new ArrayList<Student>();
    for(int i=0;i<5;i++){
      stu.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt() ) );
    }
    for(Student s:st){
      System.out.println(s.id+""+s.name+""+s.city+""+s.year);
    }
  }
}
