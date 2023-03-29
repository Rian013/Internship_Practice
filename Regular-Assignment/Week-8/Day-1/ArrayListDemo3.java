import java.util.*;
class ArrayListDemo3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    List<Integer> list=new ArrayList<Integer>();
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    System.out.println(list);
       // System.out.println(list.get(2));
    //list.set(1,17);
    // System.out.println(list);
      //  System.out.println(list.indexOf(14));
    List<Integer> list1=new ArrayList<Integer>();
    list1.addAll(list);
         System.out.println(list1);

    //for( Integer i:list){
    //  System.out.println(i);
   // }
      
  }
}