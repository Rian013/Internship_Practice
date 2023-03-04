import java.util.*;
class ChangingPosition{
  static void order(String str){
    char ch[] = str.toCharArray();
    String alph="",dig ="";
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
        alph=alph+ch[i];
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
      dig=dig+ch[i];
      }
    }
    System.out.println(alph+dig);

  }
    public static void main(String args[]){
        order("a1b2c3");
    }
}