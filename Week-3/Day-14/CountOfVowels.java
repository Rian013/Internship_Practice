import java.util.*;
class CountOfVowels{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
       char  arr[]=new char[5];
      int sum=0;
      int count =0;
      System.out.println("Enter the values");
      for(int i=0;i<5;i++)
        arr[i]=sc.next().charAt(0);
       System.out.println("*************vowels of  Array Elements************");
      for(int i=0;i<5;i++){
        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='u'||arr[i]=='i'||arr[i]=='A'||arr[i]=='E'||arr[i]=='O'||arr[i]=='U'||arr[i]=='I'){
          System.out.println(arr[i]);
          count++;
        }
       
      }
      System.out.println("The Count is :");
      System.out.println(count);
    }
}