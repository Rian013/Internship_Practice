import java.util.Scanner;
class WeekDaysUsingSwitch
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = input.nextInt();	
   switch(num){
     case 1:
       System.out.println("Sunday");
       break;
       case 2:
       System.out.println("Monday");
       break;
       case 3:
       System.out.println("Tuesday");
       break;
       case 4:
       System.out.println("wednesday");
       break;
       case 5:
       System.out.println("thursday");
       break;
       case 6:
       System.out.println("friday");
       break;
       case 7:
       System.out.println("saturday");
       break;
     default:
       System.out.println("invalid");
   }
       
   }
}
    