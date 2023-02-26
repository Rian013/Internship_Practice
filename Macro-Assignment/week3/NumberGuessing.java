import java.util.*;
import java.util.Random;
class NumberGuessing{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int randNum = rand.nextInt(100);
   int guess=0;
    do{
      System.out.println("Guess num :");
      guess =sc.nextInt();
      System.out.println(randNum);
      if(guess==randNum){
        System.out.println("Congrats!Boy Your Guess is Correct!");
      }
      else{
        System.out.println("incorrect!guess");
      }
    }
      while(guess!=randNum);

  }
}