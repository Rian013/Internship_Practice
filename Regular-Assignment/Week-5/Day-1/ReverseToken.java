import java.util.StringTokenizer;
class ReverseToken{
  public static void main(String args[]){
    String s ="Welcome to Bitlabs";
    StringTokenizer st = new StringTokenizer(s);
 
    String sReversed = "";
 
    while(st.hasMoreTokens()){
      sReversed=st.nextToken()+" "+sReversed;
      
    }
    System.out.println("Original string is :" +s);
    System.out.println("After the String is reversed :" +sReversed);
  }
}