package Graphs;
import java.util.*;

public class TopoLogical_Sort {

    public static class Edge {
        int src;
        int dst;

        Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void Indegree(ArrayList<Edge>[] graph, int[] ind) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                ind[e.dst]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph, int[] deg) {
        Indegree(graph, deg);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<graph.length; i++) {
            if (deg[i] == 0) {
                q.add(deg[i]);
            }
        }
            while(!q.isEmpty()){
                int curr = q.remove();
                System.out.print(curr + " ");
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    deg[e.dst]--;
                    if(deg[e.dst] == 0){
                        q.add(deg[e.dst]);
                    }
                }
            }
        System.out.println();
    }

    public static void main(String[] args) {

        int V = 6;  // changed to 6
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));

        int[] ind = new int[V];
        topSort(graph, ind);
    }
}
