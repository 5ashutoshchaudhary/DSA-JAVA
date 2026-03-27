package HashMap;
import java.security.Key;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert
        hm.put("India",5);
        hm.put("China",15);
        hm.put("USA",35);
        System.out.println(hm);
//    Get
       int p = hm.get("USA");
        System.out.println(p);
//    contains
        System.out.println(hm.containsKey("Indonesia"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("USA"));
        System.out.println(hm);
    }
}
