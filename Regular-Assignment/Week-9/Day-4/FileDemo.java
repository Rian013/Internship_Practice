import java.io.FileOutputStream;
import java.io.FileWriter;
class FileDemo{
  public static void main(String args[]){

    try{
      FileOutputStream fw=new FileOutputStream("rian.txt");
      String str="lionel messi is the goat";
      byte bytes[]=str.getBytes();
      
      fw.write(bytes);
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
    
  }
}