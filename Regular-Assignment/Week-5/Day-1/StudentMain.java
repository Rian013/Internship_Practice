class Student{
  String name;
  int id;
  String branch;
  double sub1,sub2,sub3;
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
    st1.name="Rian";
    st1.branch = "ECE";
    st1.id=1234;
    st1.sub1=80;
    st1.sub2=90;
    st1.sub3=100;
    st1.average();
    st1.percentage();
     Student st2 = new Student();
    st2.name="Shradda";
    st2.branch = "ECE";
    st2.id=123;
    st2.sub1=90;
    st2.sub2=90;
    st2.sub3=100;
    st2.average();
    st2.percentage();
    
  }
}