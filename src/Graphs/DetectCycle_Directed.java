package Graphs;
import java.util.*;
public class DetectCycle_Directed {
    public static class Edge {
        int src;
        int dst;

        Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static boolean isCycle(ArrayList<Edge>[]graph){
        for(int i = 0; i<graph.length; i++){
            boolean []vis = new boolean[graph.length];
            boolean []stack = new boolean[graph.length];

            for(int j = 0; j<graph.length; j++){
                if(!vis[i]){
                    if(isCycleUtil(graph,i,vis,stack)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[]graph,int curr,boolean []vis,boolean []stack){
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if((stack[e.dst])){
                return true;
            }

            if(!stack[e.dst] && isCycleUtil(graph,e.dst,vis,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> []graph = new ArrayList[V];
        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));

        System.out.println(isCycle(graph));
    }
}
