import java.util.Scanner;
class Car{
  String name,model,color;
  int year;
  Car(){
   Scanner sc = new Scanner(System.in);
      System.out.println("enter the name of the car ");
      name=sc.next();
      System.out.println("enter the model of the car ");
      model=sc.next();
      System.out.println("enter the color of the car ");
      color=sc.next();
      System.out.println("enter the year car was launched ");
      year=sc.nextInt();
      System.out.println("------------");
      
      
    }

  void carAttributes(){
    System.out.println("the car attributes are \n*********\n ");
    System.out.println("the name of the car is -"+name);
    System.out.println("the model of the car is -"+model);
    System.out.println("the color of the car is -"+color);
    System.out.println("the car launched in the year -"+name);
      System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Car c=new Car();
   carAttributes();
  }
}