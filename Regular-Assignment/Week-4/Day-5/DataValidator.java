// Data validator: Create a menu based application that can display list of options:
//                 --> Email Verifier: Create a method that takes an email address as input and verifies if it is in the correct format using regular expressions.
//                 --> Username and password Verifier: Create a method that takes an username and password as input and verifies these are following basic rules                       (having 1 uppercase, lowercase, 1 digit, 1 special character etc....)
//                 --> Mobile number Verifier: Create a method that  takes a mobile number as input and verifies it contains only digits or not, length should be 10                      digits, starts with 6 or 7 or 8 or 9.
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
// import java.util.Scanner;

// class DataValidator {
//   static boolean verifyEmail(String email) {
//       String patternString = "[a-zA-Z0-9._%+-]+[@]+[a-zA-Z]+[.][a-z]{2,3}$";
//       Pattern pattern = Pattern.compile(patternString);
//       Matcher matcher = pattern.matcher(email);
//       return matcher.matches();
//     }
//   static boolean verifiyUsePass(String userName,String Password){
//      String patternString1 = "[a-zA-Z0-9._%+-]+[a-zA-Z]+[a-z]$";
//           Pattern pattern = Pattern.compile(patternString1);

//     if(patternString)
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("*******Data Validator***********");
//     System.out.println("1)EmailValidation 2)Username and password validation 3)mobile number validation 4)Exit ");
//     String email=sc.nextLine();
//     Boolean op=verifyEmail(email);
//     if(op==true)
//       System.out.println("Matched!!!");
//     else 
//       System.out.println("Not Matched!!!");
//   }
// }
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
 
class DataValidator{
  static boolean verifyEmail(String email) {
    String patternString = "[a-zA-Z0-9._%+-]+[@]+[a-zA-Z]+[.][a-z]{2,3}$";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }
  static void usernamePasswordVerifier(String username, String password) 
  {
    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    if (username.matches(regex))  
    {
      System.out.println("Valid Username");
    } 
    else 
    {
      System.out.println("Valid Username");
    }
    if(password.matches(regex))
    {
      System.out.println("Valid Password");
    } 
    else 
    {
      System.out.println("Invalid Password");
    }
  }
  static Boolean validate(String ph){
    String patternString ="[6-9]{1}+[0-9]{9}";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(ph);
    return matcher.matches();
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int ch=0;
    while(ch!=4){
    System.out.println("---Data Validation---");
    System.out.println(" 1.Email Validator \n 2.Username and Password Validator \n 3.PhoneNumber Validator \n 4.Exit");
    System.out.print("Enter your choice:");
    ch=sc.nextInt();
    switch(ch){
      case 1: 
        System.out.println("Enter your Email: ");
        String email=sc.next();
        Boolean op=verifyEmail(email);
        if(op==true)
          System.out.println("Matched!!!");
        else 
          System.out.println("Not Matched!!!");
        break;
      case 2:
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        usernamePasswordVerifier(username, password);
        break;
      case 3:
        String ph=sc.next();
        boolean op1=validate(ph);
        if((op1==true) && (ph.length()==10))
          System.out.println("Matched!!!");
        else 
          System.out.println("Not Matched!!!");
        break;
      case 4:
        System.out.println("Thank You");
        break;
      default:System.out.println("Invalid choice!!!");
    }
    }
  }
}