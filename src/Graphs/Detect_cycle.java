package Graphs;
import java.util.*;
public class Detect_cycle {
    public static class Edge{
        int src;
        int dst;

        Edge(int s,int d){
            this.src = s;
            this.dst = d;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> []graph = new ArrayList[V];
        for(int i = 0; i<V; i++){
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

        System.out.println(DetectCycle(graph));
        System.out.println(isBipartite(graph));
    }

    public static boolean DetectCycle(ArrayList<Edge> []graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i<graph.length; i++){
            if(!vis[i]){
                if(dfs(graph,vis,0,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isBipartite(ArrayList<Edge>[]graph){
        int col[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<graph.length; i++){
            col[i] = -1;
        }

        for(int i = 0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dst] == -1){
                            col[e.dst] = col[curr] == 0 ? 1 : 0;
                            q.add(e.dst);
                        }else if(col[e.dst] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean dfs(ArrayList<Edge>[] graph,boolean []vis,int curr,int par){
        vis[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
           if(!vis[e.dst] && dfs(graph,vis,e.dst,curr)){
               return true;
           }else if(vis[e.dst] && e.dst != par){
               return true;
           }
        }
        return false;
    }
}
