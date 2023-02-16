import java.util.Scanner;
class UserEmail{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String userInput;
  System.out.println("Enter the user name/E-mail");
  userInput=sc.next();
  if(userInput.equals("bob1")||userInput.equals("bob123@gmail.com"))
    System.out.println("Acess Granted  :");
  else
    System.out.println("Acess Denied ");
}
}
   