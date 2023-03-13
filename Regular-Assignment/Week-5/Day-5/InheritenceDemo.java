class Animal{
  String name;
  String color;
  int tailLength;
  int no_of_legs;
  void eat(){
    System.out.println("eating..................");
  }
}
  class Dog extends Animal{
    String bread;
    String type_of_dog;
    void bark(){
      System.out.println("barking.......");
    }
  
    void display(){
   System.out.println(name+" "+color+" "+tailLength+" "+no_of_legs+" "+bread+" "+type_of_dog);
  }
  }
    public class InheritenceDemo{
      public static void main(String args[]){
        Dog dog = new Dog();
        dog.name="tommy";
        dog.color="Brown";
        dog.tailLength=12;
        dog.no_of_legs=2;
        dog.bread="lab";
        dog.type_of_dog="pet";
        dog.eat();
        dog.bark();
        dog.display();
      }
    }

  
