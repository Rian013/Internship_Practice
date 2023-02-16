import java.util.*;
class ElectricityBill{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Electricity unit Charges: ");
    double unit, bill,chargeAmount,totalCharge;
    unit = sc.nextDouble();
    if(unit<=50){
      bill=unit*0.50;
    }
    else if(unit<=150){
      bill=25+((unit-50)*0.75);
    }
    else if(unit<=250){
      bill=100+((unit-150)*1.20);
    }
     else {
      bill=220+((unit-250)*1.50);
    }
    chargeAmount=bill*0.2;
    totalCharge=chargeAmount+bill;
    System.out.println("Electricity bill is = "+totalCharge);
    
  }
  
}
