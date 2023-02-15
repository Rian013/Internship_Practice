class Inc{
  public static void main(String args[]){
    int a=10;
    int y=a++ + a++ + --a + ++a;
    System.out.println(y);//11
    //System.out.println(++a);//11
    System.out.println(a);//12
  }