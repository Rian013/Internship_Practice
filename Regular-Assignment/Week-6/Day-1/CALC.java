// Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.
class Calculator
  {
    public void add(int a,int b)
    {
      System.out.println(a+b);
    }
    public void add(double a,double b)
    {
      System.out.println(a+b);
    }
    public void add(int a,int b,long c)
    {
      System.out.println(a+b+c);
    }
  }
class CALC
  {
    public static void main(String args[])
    {      
      Calculator cal = new Calculator();
      cal.add(10, 20);
      cal.add(3.00, 4.00);
      cal.add(2, 3, 45);

    }
  }