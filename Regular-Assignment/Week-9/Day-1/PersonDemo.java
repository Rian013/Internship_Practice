import java.util.ArrayList;
import java.util.*;

class Person implements Comparable<Person> {
  private String name;
  private int age;
  
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  
  public int compareTo(Person p) {
    if (age < p.getAge()) {
      return -1;
    } else if (age > p.getAge()) {
      return 1;
    } else {
      return name.compareTo(p.getName());
    }
  }
}

class AgeComparator implements Comparator<Person> {
  public int compare(Person p1, Person p2) {
    if (p1.getAge() < p2.getAge()) {
      return -1;
    } else if (p1.getAge() > p2.getAge()) {
      return 1;
    } else {
      return 0;
    }
  }
}

class PersonDemo {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++)
      {
    people.add(new Person(sc.next(), sc.nextInt()));
     }
    
    System.out.println("Sorted based on age:");
    Collections.sort(people, new AgeComparator());
    for(Person p: people){
      System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
    
    System.out.println("Sorted based on age and name:");
    Collections.sort(people);
    for(Person p: people){
      System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
  }
}
