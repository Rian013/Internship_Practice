import java.util.*;
class TrafficLight{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter traffic condition :");
    String trafficFlow=sc.next();
    System.out.println("Enter the time :");
    int time = sc.nextInt();
    if(time>=8&&time<10&&trafficFlow.equals("heavy")){
      System.out.println("Red light in east-west and green in south-north");
    }
       else if(time>=10&&time<12&&trafficFlow.equals("heavy")){
      System.out.println("green  light in east-west and red in south-north");
    }
    else if(time>=12&&time<14&&trafficFlow.equals("heavy")){
      System.out.println("red  light in east-west and red in south-north");
    }
    else if(time>=14&&time<16&&trafficFlow.equals("heavy")){
      System.out.println("green  light in east-west and red in south-north");
    }
    else {
      System.out.println("yellow for all direction");
}
    }
    
  }
