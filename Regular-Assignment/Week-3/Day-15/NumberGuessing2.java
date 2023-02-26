import java.util.*;
import java.util.Random;
class NumberGuessing2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int randNum = rand.nextInt(100);
    System.out.println(randNum);
   int guess=0;
    int count =0;
    do{
      System.out.println("Guess num :");
      guess =sc.nextInt();
      
      if(guess==randNum){
        System.out.println("Congrats!Boy Your Guess is Correct!");
      }
      else{
        System.out.println("incorrect!guess");
        if(randNum>guess){
          System.out.println("guess number is less than the random number");
        }
        else{
          System.out.println("guess number is greater than the random number");
        }
          
        }
      count++;
      if(count>=3){
        System.out.println("You lost !you have exceeded the chances ");
        break;
      }
      
    }
      while(guess!=randNum);

  }
}