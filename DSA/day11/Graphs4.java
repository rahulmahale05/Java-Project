package DSA.day11;

import java.util.ArrayList;

public class Graphs4 {
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
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }
    public static boolean cycleUndirected(ArrayList<Edge> graph[] , boolean visited[] ,int curr , int parent){
        visited[curr] = true;
        for(Edge e : graph[curr]){
            if(visited[e.dest]  && parent != e.dest) return true;
            else if(!visited[e.dest]){
                if(cycleUndirected(graph, visited, e.dest, curr)) return true;
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(cycleUndirected(graph, new boolean[V], 0, -1));
    }
}
