class Student{
  String name;
  int id;
  String branch;
  double sub1,sub2,sub3;
  Student(){
      name="Rian";
    branch = "ECE";
   id=1234;
    sub1=80;
    sub2=90;
    sub3=100;
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
class StudentMain{
  public static void main(String args[]){
    Student st1 = new Student();
   st1.average();
    st1.percentage();
    
  }
}