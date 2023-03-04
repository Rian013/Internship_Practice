import java.util.Scanner;
class FreqOfOccurance{
  static void allOccur(String allCharStr,char ch){
    	int i = 0, flag = 0;
		while(i < allCharStr.length())
		{
			if(allCharStr.charAt(i) ==  ch) {
				flag++;
			}
			i++;
		}
    if(flag>)
    System.out.println("The given Character is repeated "+flag+"times");
  }
	public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    String allCharStr;
		  char ch;

		System.out.print("Enter String  =  ");
		allCharStr = sc.nextLine();
		
		System.out.print("Enter the Character to Find =  ");
		ch = sc.next().charAt(0);
    allOccur(allCharStr,ch);
		
	}

}



// import java.util.*;
// class MaxOccuring{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
   
//     char a[] = str.toCharArray();
//     for(int i=0; i<a.length; i++){
//       for(int j=0; j<i; j++){
//         if(a[i]==a[j]){
//           System.out.println(a[i]);
//         }
//       }
//     }
//   }
// }


// import java.util.Scanner;

 

// public class MaxArray {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a string:");
//     String s = sc.nextLine();

 

//     char maxChar = ' ';
//     int maxCount = 0;
//     for (int i = 0; i < s.length(); i++) {
//       char c = s.charAt(i);
//       int count = 1;
//       for (int j = i + 1; j < s.length(); j++) {
//         if (c == s.charAt(j)) {
//           count++;
//         }
//       }
//       if (count > maxCount) {
//         maxCount = count;
//         maxChar = c;
//       }
//     }
//     System.out.println(maxChar);
//   }
// }