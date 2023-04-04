import java.util.HashMap;
import java.util.Map;

class MapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> map = new  HashMap<Integer,String>();
    map.put(1,"rian");
    map.put(2,"r");
    map.putIfAbsent(3, "abc");
    map.remove(2);
    System.out.println(map);
    Integer key = 1;
    for(Map.Entry m:map.entrySet()){
    if(m.getKey()==key){
      System.out.println(m.getValue());
    }
    //System.out.println(m.getKey()+" "+m.getValue());
  }
   
  }
}