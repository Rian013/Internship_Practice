// Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;
class RetreiveElement{
  public static void main(String args[]){
    List<Integer> ab = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++){
      ab.add(sc.nextInt());
    }
    int c = ab.get(1);
   System.out.println(c);
}
}