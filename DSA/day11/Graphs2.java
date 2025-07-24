package DSA.day11;

import java.util.ArrayList;

public class Graphs2 {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[2].add(new Edge(3, 0));

    }
    public static boolean cycleDetection(ArrayList<Edge> graph[] ,boolean visited[],boolean rec[] , int curr){
        visited[curr] = true;
        rec[curr] = true;
        for(Edge e : graph[curr]){
            if(rec[e.dest]) return true;
            else if(!visited[e.dest] && cycleDetection(graph, visited, rec, e.dest)) return true;
        }
        rec[curr] = false;
        return false;
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean visited[] = new boolean[V];
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]){
                boolean isCycle = cycleDetection(graph, visited, new boolean[V], 0);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
