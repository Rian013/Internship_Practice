import java.util.Scanner;
class Library{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    
    System.out.println("book name:");
    String book=sc.next();
    System.out.println("author name");
    String author=sc.next();
    System.out.println("Member_id");
    int num3=sc.nextInt();
    System.out.println("Author name is "+author);
    System.out.println("borrowed book is is "+book);
    System.out.println("Member id  "+num3);
  }
}