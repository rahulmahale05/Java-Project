package DSA.day11;

import java.util.ArrayList;
import java.util.Stack;

public class Tarjans {
        static class  Edge {
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));

        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 1));

        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }
    public static void dfs(ArrayList<Edge> graph[] , int curr , boolean visited[] , int dt[] , int low[] , int time , int parent){
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(Edge e : graph[curr]){
            if(e.dest == parent) continue;
            else if(!visited[e.dest]){
                dfs(graph, e.dest, visited, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] < low[e.dest]){
                    System.out.println("Bridge is "+curr+"-------"+e.dest);
                }
            }else{
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    } 
    public static void getBridge(ArrayList<Edge> graph[] , int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                dfs(graph,i,visited,dt,low,time,-1);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getBridge(graph, V);
    } 
}
