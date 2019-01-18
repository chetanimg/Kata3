package kata3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Histogram <T>{
    private final Map<T,Integer> map = new HashMap<>();
    
    public Integer get(T key) {
        return map.get(key); 
    }
    
    public Set<T> keySet() {

        Set <T> keyset = new TreeSet<>();
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            T key = entry.getKey();
            keyset.add(key);
        }
        return keyset;
    }
    
    public void increment(T key) {
         map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
    
}
