package DSA.day11;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class BellmanFord {
    static class Edge {
        int src;
        int dest;
        int weight;
        public Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[] ){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
    public static void shortestPath(ArrayList<Edge> graph[] , int src){
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(src != i){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int j = 0; j < dist.length-1; j++) {
            for(Edge e : graph[j]){
                int u = e.src;
                int v = e.dest;
                if(dist[u] != Integer.MAX_VALUE && dist[u]+e.weight < dist[v]){
                    dist[v] = dist[u] + e.weight;
                }
            }
        }
        for (int j2 = 0; j2 < dist.length; j2++) {
            System.out.print(dist[j2]+" ");
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        shortestPath(graph, 0);
    }
}
