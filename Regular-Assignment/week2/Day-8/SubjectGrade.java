import java.util.*;
class SubjectGrade{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Physics marks :");
    double phy= sc.nextDouble();
    System.out.println("Enter the chemisry marks :");
    double chem= sc.nextDouble();
    System.out.println("Enter the Maths marks :");
     double math= sc.nextDouble();
    System.out.println("Enter the biology marks marks :");
     double bio= sc.nextDouble();
    System.out.println("Enter the computer marks :");
     double comp= sc.nextDouble();
     double per;
    per =((phy+chem+math+bio+comp)/500)*100;
    System.out.println("Percentage is: "+per);
       if (per>=90&&per<100)
      System.out.println("Grade A");
       else if (per>=80&&per<90)
      System.out.println("Grade b");
      else if (per>=70&&per<80)
      System.out.println("Grade c");
      else if (per>=60&&per<70)
      System.out.println("Grade d");
      else if (per>=40&&per<60)
      System.out.println("Grade e");
    else
         System.out.println("Grade F");
    
     }
}