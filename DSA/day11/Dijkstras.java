package DSA.day11;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijkstras {
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

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int n , int d){
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }
    public static void shortestPath(ArrayList<Edge> graph[], boolean visited[] , int src ){
        PriorityQueue<Pair> q = new PriorityQueue<>();
        int dist [] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        q.add(new Pair(0, 0));
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            if(!visited[curr.node]){
                visited[curr.node] = true;

                for(Edge e : graph[curr.node]){
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u]+e.weight < dist[v]){
                        dist[v] = dist[u]+e.weight;
                        q.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        shortestPath(graph, new boolean[V], 0);
    }
}
