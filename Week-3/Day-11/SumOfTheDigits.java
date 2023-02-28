import java.util.Scanner;

 class SumOfTheDigits{
	
	public static void main(String[] args) {
		int Number, Reminder, Sum = 0;
		 Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
		System.out.println("Sum of the digits of Given Number "+Sum);
	}
}