// Create a class called "Circle" with instance variables for radius and diameter. Add a parameterized constructor that takes radius as a parameter and calculates the diameter, and add a method to calculate the area.
import java.util.*;
class Circle{
  int radius;
  int diameter;
  Circle(int r){
    radius =r;
    diameter = 2*r;
    }
  void display(){
    System.out.println("Radius"+radius);
     System.out.println("diameter"+diameter );
   }
  void area(){
    System.out.println("Area is "+(3.14*radius*radius));
  }
  public static void main(String args[]){
    Circle c = new Circle(5);
    c.display();
    c.area();
  }
}