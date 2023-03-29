// Write a Java program to create a new array list, add some colors (string) and print out the collection
import java.util.*;
class AddColor{
  public static void main(String args[]){
    List<String> a = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++){
      a.add(sc.next());
    }
    System.out.println("colors are :");
    for(String s:a){
          System.out.println(s);

    }
  }
}