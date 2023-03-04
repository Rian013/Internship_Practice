import java.util.*;
class AlphaDigSpl{
  static void charCount(String str){
    char ch[] = str.toCharArray();
    int acount=0,dcount=0,scount=0;
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
        acount++;
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        dcount++;
      }
      else{
        scount++;
      }
    
    }
    System.out.println("alphabets"+acount);
    System.out.println("digit"+dcount);
    System.out.println("spl"+scount);
    
  }
    public static void main(String args[]){
        charCount("admin123@");
    }
}