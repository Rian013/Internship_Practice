import java.util.*;
class ArrayListDemo5{
  public static void main(String args[]){
     List<Integer> l=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      l.add(sc.nextInt());
    }
     for(Integer n:l){
       if(n%2==0){
         System.out.println(num);
       }
     }
    
    System.out.println(l);
}
}