class StudentMain {
  private int rollNo;
  private String name;
  private String dept;
  private char section;

  void setRollno(int rollNo) {
    this.rollNo = rollNo;
  }

  void setName(String name) {
    this.name = name;
  }

  void setDept(String dept) {
    this.dept = dept;
  }

  void setSection(char section) {
    this.section = section;
  }

  int getRollno() {
    return this.rollNo;
  }

  String getName() {
    return this.name;
  }

  String getDept() {
    return this.dept;
  }

  char getSection() {
    return this.section;
  }

}

public class Student {
  public static void main(String args[]) {
    StudentMain s = new StudentMain();
    s.setName("rian");
    s.setRollno(1234);
    s.setDept("ece");
    s.setSection('b');
    System.out.println(s.getName());
    System.out.println(s.getRollno());
    System.out.println(s.getDept());
    System.out.println(s.getSection());
  }
}