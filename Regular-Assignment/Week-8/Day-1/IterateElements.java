// Write a Java program to iterate through all elements in a array list
import java.util.*;
class IterateElements{
  public static void main(String args[]){
    List<Integer> l = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++){
      l.add(sc.nextInt());
    }
    for(Integer i:l){
      System.out.println(i);
    }
  }
}