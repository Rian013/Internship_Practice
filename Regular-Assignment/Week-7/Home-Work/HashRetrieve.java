import java.util.HashMap;
import java.util.Map;

public class HashRetrieve {
  public static void main(String args[]){
     Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 10);
        map.put("b", 5);
        map.put("b", 7);

        String key = "a";
            int value = map.get(key);
            System.out.println(key + " = " + value);
  }
}