// Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() me{hods.
 class Shape{
   double getArea(){
     return 0.0;
   }
 }
   class Circle extends Shape{
     double getArea(){
       int r = 5;
       double area = 3.24*r*r;
       return area;
     }
   }
     class Rectangle extends Shape{
       double getArea(){
         int l=2,b=3;
         double area = l*b;
         return area;
       }
     }
public class OverRiding2{
  public static void main(String args[]){
    Circle c = new Circle();
    Rectangle b = new Rectangle();
    System.out.println("area"+ c.getArea());
    System.out.println("arae"+ b.getArea());
    
  }
}
 
