import java.util.StringTokenizer;
class StringTokenizerDemo{
  static void stringToken(String str){
     StringTokenizer s = new StringTokenizer(str);
    while(s.hasMoreTokens()){
       System.out.println(s.nextToken());
    }
  }
  public static void main(String args[]){
    stringToken("Welcome to bitlabs");
  }
}

// import java.util.StringTokenizer;
// class StringTokenizerDemo{
//   public static void main(String args[]){
//     StringTokenizer s = new StringTokenizer("Welcome to bitlabs");
//     while(s.hasMoreTokens()){
//       System.out.println(s.nextToken());
//     }
//   }
// }