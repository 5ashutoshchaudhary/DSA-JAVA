package HashMap;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("Ashutosh",99);
        h.put("Ram",96);
        h.put("Shyam",96);
        Set<String> Keys = h.keySet();
        for(String k : Keys){
            System.out.println("Keys = " + k + ", Values = " + h.get(k));
        }
    }
}
