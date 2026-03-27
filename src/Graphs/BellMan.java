package Graphs;
import java.util.*;

public class BellMan {

    public static class Edge{
        int src;
        int dst;
        int wt;

        Edge(int s,int d,int w){
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void bellmanFord(ArrayList<Edge> edges,int V,int src){

        int []dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax edges V-1 times
        for(int i = 0; i < V-1; i++){
            for(Edge e : edges){
                int u = e.src;
                int v = e.dst;
                int w = e.wt;

                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }

        // Check negative cycle
        for(Edge e : edges){
            int u = e.src;
            int v = e.dst;
            int w = e.wt;

            if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                System.out.println("Graph has Negative Weight Cycle");
                return;
            }
        }

        System.out.println("Shortest distances:");
        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, -3));
        edges.add(new Edge(1, 3, 2));
        edges.add(new Edge(2, 4, 2));
        edges.add(new Edge(3, 4, 3));

        bellmanFord(edges, V, 0);
    }
}