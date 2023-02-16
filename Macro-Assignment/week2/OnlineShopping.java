import java.util.Scanner;
class OnlineShopping{
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
   System.out.println("enter how much item you want?");
    int item = sc.nextInt();
    int itemStock = 6;
    int amountPerItem=250;
    int acBalance=1200;
    int totalAmount =item*amountPerItem;
    if(item>itemStock )
    {
      System.out.println("item out of stock");
    }
    else{
      System.out.println("please proceed for payment = " + totalAmount);
    }
    if((totalAmount>acBalance)){
      System.out.println(" Insufficient balance ");
    }
    
    else{
      System.out.println("payement done");
    }
  }
}
