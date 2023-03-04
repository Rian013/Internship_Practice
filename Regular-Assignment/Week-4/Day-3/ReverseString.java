import java.util.*;
class ReverseString{
  static void reverse(String s){
    String rev = " ";
   char a[] = s.toCharArray();
      rev = " ";
   for(int j=a.length-1;j>=0;j--){
     // rev = rev+a[i];
      rev = rev + a[j];
    }
    System.out.print(rev+" ");
  }
  public static void main(String args[]){
    reverse("Goat yes");
  }
}