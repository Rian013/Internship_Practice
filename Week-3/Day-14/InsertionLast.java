import java.util.Scanner;
class InsertionLast{
  public static void main(String args[]){
    //declare varaible
    Scanner sc=new Scanner(System.in);
    int n,i;
    System.out.println("Enter the n value :");
    n = sc.nextInt();
    int a[]=new int[n];
    //reading
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    int newValue=20;
    a[n-1]=newValue;
    System.out.println("after insertion");
    for(int j=0;j<a.length;j++){
      System.out.println("a["+j+"]="+a[j]);
    }
  }
}