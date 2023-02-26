import java.util.*;
class UserAge{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    boolean valid = true;
   do{
      System.out.println("Enter The Age: ");
      int age = sc.nextInt();
     if(age>0){
       System.out.println("valid age :");
        valid = false;
     }
     else{
       System.out.println("Invalid Age and again enter :");
     }
   }
     while(valid);
   
}
}