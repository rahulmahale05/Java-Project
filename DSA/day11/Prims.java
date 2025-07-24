package DSA.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prims {
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
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));

    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int n , int c){
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void PrimsAlgo(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> q = new PriorityQueue<>();
        boolean visited[] = new boolean[graph.length];
        q.add(new Pair(0, 0));
        int mstCost = 0;
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            if(!visited[curr.node]){
                visited[curr.node] = true;
                mstCost += curr.cost;
                for(Edge e : graph[curr.node]){
                    if(!visited[e.dest]){
                        q.add(new Pair(e.dest, e.weight));
                    }
                }
            }
        }
        System.out.println("Cost of mst is "+mstCost);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        PrimsAlgo(graph);
    }
}
