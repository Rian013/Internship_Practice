import java.util.Scanner;
class AllOccurance{
  static void allOccur(String allCharStr,char ch){
    	int i = 0, flag = 0;
		while(i < allCharStr.length())
		{
			if(allCharStr.charAt(i) ==  ch) {
				flag++;
			}
			i++;
		}
    System.out.format("\nThe  Character Occurrence of %c is %d times", 
					ch, flag);
  }
	public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    String allCharStr;
		  char ch;

		System.out.print("\nEnter String to Find all Char Occur =  ");
		allCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
    allOccur(allCharStr,ch);
		
	}

}