package Graphs;
import java.util.*;
public class G_Revise {
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

    public static void BFS(ArrayList<Edge>[]graph,int start){
        Queue<Integer> q = new LinkedList<>();
        boolean []vis = new boolean[graph.length];
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> []graph = new ArrayList[V];
        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        graph[4].add(new Edge(2,4,2));
        graph[4].add(new Edge(2,2,4));

        for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dst + " ");
        }
        boolean []vis = new boolean[V];
        boolean []vis2 = new boolean[V];
        System.out.println();
        BFS(graph,0);
        System.out.println();
        DFS(graph,0,vis);
        System.out.println(HasPath(graph,0,4,vis2));
    }

    public static void DFS(ArrayList<Edge>[]graph,int start,boolean []vis){
        System.out.print(start + " ");
        vis[start] = true;

        for(int i = 0; i<graph[start].size(); i++){
            Edge e = graph[start].get(i);
            if(!vis[e.dst]){
                DFS(graph,e.dst,vis);
            }
        }
    }

    public static boolean HasPath(ArrayList<Edge>[]graph,int src,int dst,boolean []vis){
        if(src == dst){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dst]&&HasPath(graph,e.dst,dst,vis)){
                return true;
            }
        }
        return false;
    }
}
