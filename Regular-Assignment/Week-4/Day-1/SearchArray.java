import java.util.*;
class SearchArray{
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
    System.out.println("Enter the number you want to search  :");
    int x = sc.nextInt();
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
    if(numbers[i][j]==x){
      System.out.println("the number is at ("+i+","+j+")");
    }
      }
    }
    
    
  }
}