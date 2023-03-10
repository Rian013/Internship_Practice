import java.util.StringTokenizer;
class MaxLengthOfTokens{
  static void stringToken(String str){
     StringTokenizer s = new StringTokenizer(str);
    int maxLength=0;
    while(s.hasMoreTokens()){
       String str1 = s.nextToken();
      int length = str1.length();
      if(length>maxLength){
        maxLength=length;
      }
    }
    System.out.println("The max length is "+maxLength);
  }
  public static void main(String args[]){
    stringToken("Welcome to bitlabs");
  }
}