package Graphs;
import java.util.*;

public class Dijkstra_algorithm {

    // Edge class
    public static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    // Pair class for PriorityQueue
    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;   // Min-heap based on distance
        }
    }

    // Dijkstra Algorithm
    public static void Dijkstra(ArrayList<Edge>[] graph, int src){

        int[] dst = new int[graph.length];
        Arrays.fill(dst, Integer.MAX_VALUE);
        dst[src] = 0;

        boolean[] vis = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){

            Pair curr = pq.remove();

            if(vis[curr.node]) continue;
            vis[curr.node] = true;

            for(Edge e : graph[curr.node]){

                int u = e.src;
                int v = e.dst;
                int w = e.wt;

                if(dst[u] + w < dst[v]){
                    dst[v] = dst[u] + w;
                    pq.add(new Pair(v, dst[v]));
                }
            }
        }

        System.out.println("Shortest distances from source:");
        System.out.println(Arrays.toString(dst));
    }

    // Main method
    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        // Adding edges
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,4,1));

        // Call Dijkstra
        Dijkstra(graph, 0);
    }
}
