package Graphs;

import java.util.ArrayList;

public class HasPath {
    public static class Edge{
        int src;
        int dst;
        int wt;

        public Edge(int src, int dst, int wt){
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }
    public static boolean HASPATH(ArrayList<Edge>[]graph,int src, int dst,boolean[] Visited){
        if(src == dst){
            return true;
        }
        Visited[src] = true;
        for(Edge next : graph[src]){
            if(!Visited[next.dst]){
                 if(HASPATH(graph,next.dst,dst,Visited)){
                     return true;
                 }
            }
        }
        return false;
    }
    public static void CreateGraph(ArrayList<Edge>[]graph){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[1].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[]graph = new ArrayList[v];
        boolean []visited = new boolean[v];
        CreateGraph(graph);
        boolean result = HASPATH(graph,0,5,visited);
        System.out.print(result);
    }
}
