import java.util.Scanner;
class InsertinFirst{
  public static void main(String args[]){
    //declare varaible
    Scanner sc=new Scanner(System.in);
    int n,i;
    System.out.println("Enter the n value :");
    n = sc.nextInt();
    int a[]=new int[n+1];
    
    //reading
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    int pos = 1,newValue=20;
    //shift the values;
    for(i=(n-1);i>=(pos-1);i--){//i=4 4>1
      a[i+1]=a[i];
    }
    a[pos-1]=newValue;
    System.out.println("after insertion");
    for(int j=0;j<a.length;j++){
      System.out.println("a["+j+"]="+a[j]);
    }
  }
}