import java.util.Scanner;
class LastOccrance {
  static void lastOccur(String lastCharStr,char ch){
    	int i = lastCharStr.length()-1, flag = 0;
		while(i>=0)
		{
			if(lastCharStr.charAt(i) ==  ch) {
				flag++;
				break;
			}
			i--;
		}
		if(flag == 0) {
			System.out.println("\nSorry! We haven't found the Character ");
		}
		else {
			System.out.format("\nThe First Character Occurrence of %c at %d position", 
					ch, i);
		}
  }
	public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    String lastCharStr;
		  char ch;

		System.out.print("\nEnter String to Find last Char Occur =  ");
		lastCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
    lastOccur(lastCharStr,ch);
		
	}

}