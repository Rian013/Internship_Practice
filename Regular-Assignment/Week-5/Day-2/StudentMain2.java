class Student{
  String name;
  int id;
  String branch;
  double sub1,sub2,sub3;
  Student(String s,String y,int a,int b,int c,int d){
      name=s;
    branch = y;
   id=a;
    sub1=b;
    sub2=c;
    sub3=d;
  }
  void average(){
    double avg = (sub1+sub2+sub3)/3;
  System.out.println(name+" average is "+avg);
  }
  void percentage(){
    double per = (sub1+sub2+sub3)/300*100;
  System.out.println(name+" percentage is "+per);
  }
}
class StudentMain2{
  public static void main(String args[]){
    Student st1 = new Student("Rian","ECE",1234,90,95,96);
   st1.average();
    st1.percentage();
    
  }
}