import java.util.Scanner;
class Password{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String pass,userInput;
  pass="yoy";
  System.out.println("Enter the password :");
  userInput=sc.next();
  if(userInput.equals(pass))
    System.out.println("Acess Granted  :");
  else
    System.out.println("Acess Denied ");
}
}
    