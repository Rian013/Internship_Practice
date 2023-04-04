//Write a Java program to iterate over the key-value pairs of a Map using the entrySet() method
import java.util.HashMap;
import java.util.Map;

public class EntrySet1{
  public static void main(String args[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        for (Map.Entry  entry : map.entrySet()) {
        
           
           System.out.println(entry.getKey() + " = " +   entry.getValue());
        }
  }
}