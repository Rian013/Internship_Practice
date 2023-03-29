import java.util.*;
class ArrayListDemo2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    List list=new ArrayList();
    list.add(sc.next());
    list.add(sc.next());
    list.add(sc.next());
    System.out.println(list);
    for( Object str:list){
      System.out.println(str);
    }
      
  }
}