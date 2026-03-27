package Strings;
import java.util.*;
public class ShortestPath {
    public static double Findpath(String path){
    int x = 0,y = 0;
        for(int i = 0; i<path.length(); i++){
            int dir = path.charAt(i);
            if(dir == 'E'){
                x++;
            }else if(dir == 'W'){
                x--;
            }else if(dir == 'N'){
                y++;
            }else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        double dist = Math.sqrt(X2+Y2);
        return dist;
    }
    public static void main(String[] args) {
        String path = "WNEENESENN";
        double result = Findpath(path);
        System.out.print("Shortest distance form origin: "+result);
    }
}
