import java.util.HashMap;
import java.util.Map;

public class ValuesMap {
  public static void main(String args[]){
       Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("Mango", 3);

        for (Integer value : map.values()) {
            System.out.println(value);
        }
  }
}