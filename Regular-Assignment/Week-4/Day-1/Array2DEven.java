import java.util.*;
class Array2DEven{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Rows: ");
    int a = sc.nextInt();
    System.out.println("Enter the number of col: ");
    int b = sc.nextInt();
    int numbers[][] = new int[a][b];
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
      numbers[i][j]= sc.nextInt();

        } 
    }
    int count =0;
     for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
    if(numbers[i][j]%2==0){
      count++;
    }

        } 
    }
    System.out.println(count);
  }
}
// int arr[][]={{1,2,3},{2,3,4},{4,5,6}};