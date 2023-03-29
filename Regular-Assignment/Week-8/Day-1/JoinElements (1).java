import java.util.*;

public class JoinElements{
  public static void main(String args[]){

    ArrayList<Integer>list1=new ArrayList<Integer>();
    list1.add(10);
    list1.add(20);
    list1.add(30);

    ArrayList<Integer>list2=new ArrayList<Integer>();
    list1.add(40);
    list1.add(50);
    list1.add(60);

    list1.addAll(list2);

    System.out.println("Joined ArrayList:"+list1);
    
  }
}