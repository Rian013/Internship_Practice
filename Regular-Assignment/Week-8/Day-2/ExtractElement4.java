import java.util.Stack;


public class ExtractElement4{
  public static void main(String args[]){

    Stack<Integer> list=new Stack<Integer>();
    list.push(10);
    list.push(20);
    list.push(30);
    list.push(40);
    list.push(50);

  // LinkedList<Integer> sub=list.subLi
    
    System.out.println(list.subList(1,4));
  }
}