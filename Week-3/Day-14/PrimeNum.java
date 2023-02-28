import java.util.*;
class PrimeNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter the values : ");
    int count =0;
    for(int i = 0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("********Prime Num Of Array Elements Are*********");
    for(int i=0;i<5;i++){
      count=0;
    for(int j=1;j<=arr[i];j++){
      if(arr[i]%j==0)
        count++;
    }
    if(count==2)
      System.out.println(arr[i]);
    }
    }
  }
