import java.util.*;
class RockPaperScissor{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Select Rock,paper,scissor");
    String userInput,compInput;
    System.out.println("Enter user input ");
    userInput =sc.next();
    System.out.println("Enter comp input ");
    compInput =sc.next();
       if(userInput.equals(compInput))
    {
      System.out.println("tie :");
    } else if(userInput.equals("rock")&&compInput.equals("paper")||userInput.equals("paper")&&compInput.equals("scissor")||userInput.equals("scissor")&&compInput.equals("rock"))
    {
      System.out.println("computer wins");
    }
    else if(compInput.equals("rock")&&userInput.equals("paper")||compInput.equals("paper")&&userInput.equals("scissor")||compInput.equals("scissor")&&userInput.equals("rock")) {
      System.out.println("user wins :");
    }
    else{
      System.out.println("loosers");
    }
    
  }
}