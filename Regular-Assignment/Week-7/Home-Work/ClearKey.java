import java.util.Map;
import java.util.HashMap;

public class ClearKey {
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();

        map.put("Rian", 22);
        map.put("Archie", 37);
        map.put("Fernandes", 38);

        System.out.println("Map before clearing: " + map);

        map.clear();

        System.out.println("Map after clearing: " + map);
    }
}