package HashMap;
import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",5);
        hm.put("China",15);
        hm.put("USA",35);
        System.out.println(hm);
         Set<String>keys = hm.keySet();
        System.out.println(keys);
//        // or
        for (String k : keys) {
            System.out.println("Key = " + k + ",Value = " + hm.get(k));
        }

    }
}
