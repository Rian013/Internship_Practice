import java.util.*;
class ArrayTestcase2{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
      System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
      System.out.println("Enter the value");
    int value = sc.nextInt();
    for (int i = 0; i < size; i++) {
      if(value==arr[i])
      System.out.print(i);
    }
   
  }
}
 