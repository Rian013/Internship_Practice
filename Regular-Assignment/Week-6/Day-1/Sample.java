class Student
  {
    public void read()
    {
      System.out.println("the name of the book is atomic habbits");
    }
    public void read(String name)
    {
      System.out.println("the name of the book is= "+name);
    }
    public void read(int no_of_copies)
    {
      System.out.println("the copies are"+no_of_copies);
    }
  }
class Sample
  {
    public static void main(String args[])
    {
      Student student=new Student();
      student.read();
      student.read("atomichabbits");
      student.read(10);
    }
  }