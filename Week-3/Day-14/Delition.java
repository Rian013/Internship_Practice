import java.util.Scanner;
class Delition{
  public static void main(String args[]){
    //declare varaible
     Scanner sc=new Scanner(System.in);
    int n,i;
    n=sc.nextInt();
    int a[]=new int[n];
   
    //reading
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    System.out.println("Enter the position of index you want to delete :");
    int pos=sc.nextInt();
    //shift the values;
    for(i=pos+1;i<n;i++){//i=4 4>1
      a[i-1]=a[i];
    }
    System.out.println("after deletion");
    for(int j=0;j<n-1;j++){
      System.out.println("a["+j+"]="+a[j]);
    }
  }
}