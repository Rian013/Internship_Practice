import java.util.StringTokenizer;
class LengthOfToken{
  static void stringToken(String str){
     StringTokenizer s = new StringTokenizer(str);
    //int length = s.lengthTokens();
   
    while(s.hasMoreTokens()){
      String str1 = s.nextToken();
       System.out.println(str1.length());
      //count++;
    
    }
   
  }
  public static void main(String args[]){
    stringToken("Welcome to bitlabs");
  }
}
