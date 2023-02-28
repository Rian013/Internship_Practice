import java.util.Scanner;
class InsertionAssignment{
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
    int sum=0;
    for(int k=0;k<n;k++){
        sum = sum +a[k];
      }
    System.out.println("The sum is :");
        System.out.println(sum);
    int pos,newValue;
    System.out.println("Enter any of these 3 position first,mid,last");
     pos =sc.nextInt();
     newValue=0;
    if(pos==1){
      newValue=12;
    }
    else if(pos==sum/2){
      newValue=13;
    }
    else if(pos==n){
      newValue =14;
    }
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