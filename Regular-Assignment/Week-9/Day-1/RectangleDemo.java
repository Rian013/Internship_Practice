import java.util.ArrayList;
import java.util.*;

class Rectangle implements Comparable<Rectangle> {
  private double width;
  private double height;
  
  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return width * height;
  }
  
  public double getPerimeter() {
    return 2 * width + 2 * height;
  }
  
  public int compareTo(Rectangle r) {
    if (this.getPerimeter() < r.getPerimeter()) {
      return -1;
    } else if (this.getPerimeter() > r.getPerimeter()) {
      return 1;
    } else {
      return 0;
    }
  }
}

class AreaComparator implements Comparator<Rectangle> {
  public int compare(Rectangle r1, Rectangle r2) {
    if (r1.getArea() < r2.getArea()) {
      return -1;
    } else if (r1.getArea() > r2.getArea()) {
      return 1;
    } else {
      return 0;
    }
  }
}

class RectangleDemo {
  public static void main(String[] args) {
    ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter width and height for 3 rectangles:");
    for (int i = 0; i < 3; i++) {
      double width = sc.nextDouble();
      double height = sc.nextDouble();
      rec.add(new Rectangle(width, height));
    }
    System.out.println("Sorted based on area:");
    Collections.sort(rec, new AreaComparator());
    for(Rectangle r: rec){
      System.out.println("Width: " + r.getWidth() + ", Height: " + r.getHeight() +", Area:"+ r.getArea());
    }
    System.out.println("Sorted based on perimeter:");
    Collections.sort(rec);
    for(Rectangle r: rec){
      System.out.println("Width: " + r.getWidth() + ", Height: " + r.getHeight()+", ,Perimeter"+ r.getPerimeter());
    }
  }
}