import java.util.StringTokenizer;
class CountNumOfTokens{
  static void stringToken(String str){
     StringTokenizer s = new StringTokenizer(str);
        System.out.println( s.countTokens());
    while(s.hasMoreTokens()){
       System.out.println(s.nextToken());
      //count++;
      }

  }
  public static void main(String args[]){
    stringToken("Welcome to bitlabs");
  }
}