import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
class AgeCalculator{
  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the person's birth date :");
    String birth_Date = sc.next();
    LocalDate today= LocalDate.now();

    System.out.println(today);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dateofbirth = LocalDate.parse(birth_Date, dateFormat);
    Period age =Period.between(dateofbirth, today);
    
    System.out.println("Therefore the current age:"+age.getYears());
    if(age.getYears()>=18)
      System.out.println("Adult");
    else
      System.out.println("minor");
    

  }
}