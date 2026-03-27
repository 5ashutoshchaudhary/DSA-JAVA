package Graphs;
import java.util.*;
public class Shortest_path {
   public static List<List<Integer>>allPath(int [][]graph){
       int n = graph.length;
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        paths(graph,0,n-1,ans,path);
        return ans;
    }

    public static void paths(int [][]graph,int src,int dst,List<List<Integer>>ans,List<Integer> path){
       if(src == dst){
           ans.add(new ArrayList<>(path));
           return;
       }

       for(int neigh : graph[src]){
            path.add(neigh);
            paths(graph,neigh,dst,ans,path);
            path.remove(path.size()-1);
       }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {1, 2},
                {3},
                {3},
                {}
        };
        System.out.println(allPath(graph));
    }
}


