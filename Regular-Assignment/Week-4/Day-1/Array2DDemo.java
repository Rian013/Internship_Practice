import java.util.*;
class Array2DDemo{
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
    System.out.println("The output is :");
     for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
    System.out.print(numbers[i][j]+" ");

        } 
       System.out.println();
    }
    
    
  }
}

// class Array2dDemo{
//   public static void main(String args[]){
//     int a[][]={{12,45,67},{34,5,7},{12,67,89}};
//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         System.out.print(a[i][j]+" ");
//       }
//       System.out.println();
//     }
//     System.out.println(a[2][2]);
//   }
// }