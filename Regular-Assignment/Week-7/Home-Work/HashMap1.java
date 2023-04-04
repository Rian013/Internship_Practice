//Write a Java program to create a HashMap and add key-value pairs to it.
import java.util.HashMap;

public class HashMap1{
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

      
        hashMap.put(1,"apple");
        hashMap.put(2,"banana");
        hashMap.put(3,"orange");

        
        System.out.println(hashMap);
    }
}