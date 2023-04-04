import java.util.HashMap;
import java.util.Map;

public class MapCopyExample {
    public static void main(String[] args) {
        // create the first map
        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"apple");
        map1.put(2,"banana");
        map1.put(3,"orange");

        // create the second map
        Map<Integer,String> map2 = new HashMap<Integer,String>();

        // copy all the key-value pairs from map1 to map2
        map2.putAll(map1);

        // print out the contents of map2 to verify the copy
        System.out.println("Map 2: " + map2);
    }
}