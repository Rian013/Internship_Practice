import java.util.Scanner;
class Employee{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the salary ");
    int sal =sc.nextInt();
    double b=0 ;
    System.out.println("Rate performane :");
    String performance;
    performance =sc.next();
    if(performance.equals("excellent")){
      System.out.println("Recieves a bonus of 10% of salary ");
      b=sal*0.5;
      System.out.println("Total salary after recieving is "+b);
    }
    else if(performance.equals("good")){
      System.out.println("Recieves a bonus of 5% of salary ");
      b=sal*0.05;
      System.out.println("Total salary after recieving is "+b);
    }
    else if(performance.equals("average")){
      System.out.println("Recieves a bonus of 2% of salary ");
      b=sal*0.2;
      System.out.println("Total salary after recieving is "+b);
    }
    else{
            System.out.println( "no bonus :");

    }
    
  }
}