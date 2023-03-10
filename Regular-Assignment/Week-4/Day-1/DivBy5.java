import java.util.*;
class  DivBy5{
  public static void main(String args[]){
    int a[][] ={{10,3,15},{12,4,20},{3,9,10}};
    for(int i =0;i<3;i++){
      for(int j=0;j<3;j++){
        if(a[i][j]%5==0)
          System.out.print(a[i][j]+" ");
          
      }
      System.out.println();
    }
  }
}