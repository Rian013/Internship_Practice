import java.util.Scanner;
class StringReplacer1{
   static void ReplaceString(String s, String word,String rep){
   System.out.println(s.replace(word, rep));
     }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s = "Hi Welcome to bitlabs";
     System.out.println(s);
    System.out.println("Enter word you want to replace");
    String word=sc.next();
    String rep=sc.next();
    ReplaceString(s,word,rep);
    }
}