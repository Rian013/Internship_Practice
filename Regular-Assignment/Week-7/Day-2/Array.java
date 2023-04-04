import java.util.Scanner;
class Array{
  public static  void main(String args[]){
    int  arr[]= new int[5+1];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
      }
    System.out.println("Enter the position of the value :");
    int pos = sc.nextInt();
    System.out.println("Enter the element you want to insert");
    int x = sc.nextInt();
    for(int i = 4;i>=(pos-1);i--){
      arr[i+1]=arr[i];
    }
    arr[pos-1]=x;
    System.out.println("After inserting :");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}