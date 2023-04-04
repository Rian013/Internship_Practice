import java.util.HashMap;
import java.util.Map;

public class SizeDemo{
    public static void main(String args[]){
       Map<String, Integer> map = new HashMap<>();
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);
        map.put("D", 45);

        int size = map.size();

        System.out.println("The size of the map is: " +size);
    }
    }
    