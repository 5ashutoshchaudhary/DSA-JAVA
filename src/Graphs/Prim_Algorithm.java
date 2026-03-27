package Graphs;
import java.util.*;
public class Prim_Algorithm {
    public static class Edge{
        int src,dst,wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        Pair(int n,int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair c2) {
            return this.cost - c2.cost;
        }
    }

    public static int prim(ArrayList<Edge> []graph,int src){
        boolean []vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                finalCost += curr.cost;
                for(int i = 0; i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    pq.add(new Pair(e.dst,e.wt));
                }
            }

        }
        return finalCost;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize array of ArrayLists
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[1].add(new Edge(1,0,2));

        graph[0].add(new Edge(0,2,4));
        graph[2].add(new Edge(2,0,4));

        graph[1].add(new Edge(1,3,7));
        graph[3].add(new Edge(3,1,7));

        graph[2].add(new Edge(2,3,3));
        graph[3].add(new Edge(3,2,3));
        System.out.print("The final cost = " + prim(graph,0));
    }
}
