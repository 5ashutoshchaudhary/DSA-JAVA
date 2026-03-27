package Graphs;
import java.util.*;
public class BFS {
   public static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void BFS(ArrayList<Edge>[]graph,int scr){
       Queue<Integer> q = new LinkedList<>();
       boolean []vis = new boolean[graph.length];
       q.add(scr);
       while(!q.isEmpty()){
           int curr = q.remove();
           if(!vis[curr]){
               System.out.print(curr + " ");
               vis[curr] = true;
               for(int i = 0; i<graph[curr].size(); i++){
                   Edge e = graph[curr].get(i);
                   q.add(e.dest);
               }
           }
       }
    }

    public static void main(String[] args) {
       int V = 4;
        ArrayList<Edge> []graph = new ArrayList[5];
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

        BFS(graph,0);
    }
}
