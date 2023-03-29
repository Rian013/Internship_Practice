// Write a Java program to insert an element into the array list at the first 
import java.util.*;
class InsertElement{
  public static void main(String args[]){
    List<String> a = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++){
      a.add(sc.next());
    }
    a.add(1,"yellow");
    System.out.println("colors are :");
    for(String s:a){
          System.out.println(s);

    }
  }
}


// import java.util.*;

// public class InsertElement{
//   public static void main(String args[]){
//     int arr[]={1,2,3,4,5};
//     int insertValue=0;

//     System.out.println("Original array:"+Array.toString(array));
//     System.out.println("Element to add:"+elementToAdd);

//     for(int i=array.length-1;i>0;i--){
//       array[i]=array[i-1];
//     }
//     array[0]=elementToAdd;

//     System.out.println("Modified array:"+Arrays.toString(array));
//   }
// }