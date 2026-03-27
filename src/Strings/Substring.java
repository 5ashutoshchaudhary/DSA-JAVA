package Strings;
import java.util.*;
public class Substring {
    public static String Substr(String name,int si , int ei){
        String str = "";
        for(int i = si; i<ei; i++){
            str+= name.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String name = "Ashutosh chaudhary";
       String result = Substr(name,0,8);
        System.out.println(result);
    }
}
