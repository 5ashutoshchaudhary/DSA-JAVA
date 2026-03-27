package Graphs;
import java.util.*;
public class DFS {
    static class Edge{
        int src;
        int dest;
        int wt;

          Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
          }
    }

    public static void DFS(ArrayList<Edge>[]graph,int curr){
        boolean []vis = new boolean[graph.length];
        vis[curr] = true;
        System.out.print(curr + " ");

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph,e.dest);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> []graph = new ArrayList[V];
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,4));
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,3,10));
        graph[1].add(new Edge(1,0,4));

        graph[3].add(new Edge(3,2,3));
        graph[3].add(new Edge(3,1,10));

        graph[2].add(new Edge(2,3,3));
        graph[2].add(new Edge(2,0,2));

        for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(" Src : " + e.src + ", Dest : " + e.dest + ", wt : " + e.wt);
        }
        DFS(graph,0);
    }
}
