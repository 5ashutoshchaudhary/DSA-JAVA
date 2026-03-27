package Graphs;
import java.util.*;
public class Print_Path {
    public static class Edge{
        int src;
        int dest;

        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void printPath(ArrayList<Edge> []graph,int src,int dest,String s,boolean []vis){
        if(src == dest){
            System.out.print(s+dest + " ");
            return;
        }
        vis[src] = true;
        for(int i = 0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest]) {
                printPath(graph, e.dest, dest, s + src, vis);
            }
        }
        vis[src] = false;
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> []graph = new ArrayList[v];
        for(int i = 0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));

        boolean []vis = new boolean[graph.length];
        printPath(graph,2,3,"",vis);
    }
}
