package DSA.day11;

import java.util.ArrayList;

public class ArticulationPoint {
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
    public static void dfs(ArrayList<Edge> graph[] , boolean visited[] , int curr , int parent , int dt[] , int low[] , int time , boolean AP[]){
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for(Edge e : graph[curr]){
            if(parent == e.dest) continue;
            else if(visited[e.dest]){
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
            else{
                dfs(graph, visited, e.dest, curr, dt, low, time, AP);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] <= low[curr] && parent != -1){
                    AP[curr] = true;
                }
                children++;
            }
        }
        if(parent == -1 && children > 1){
            AP[curr] = true;
        }
    }
    public static void getAp(ArrayList<Edge> graph[] , int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean visited[] = new boolean[V];
        boolean AP[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                dfs(graph, visited, i, -1, dt, low, time, AP);
            }
        }

        for (int i = 0; i < AP.length; i++) {
            if(AP[i]){
                System.out.println(i);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAp(graph, V);
    }  
}
