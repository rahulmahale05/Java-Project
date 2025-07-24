package DSA.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Kosarajus {    
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
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }
    public static void topSort(ArrayList<Edge> graph[] ,boolean visited[] , Stack<Integer> s , int curr){
        visited[curr] = true;
        for(Edge e : graph[curr]){
            if(!visited[e.dest]){
                topSort(graph,visited,s,e.dest);
            }
        }
        s.push(curr);
    }
    public static void dfs(ArrayList<Edge> graph[] , boolean visited[] , int curr){
        System.out.print(curr+" ");
        visited[curr] = true;
        for(Edge e : graph[curr]){
            if(!visited[e.dest]){
                dfs(graph, visited, e.dest);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void kosarajusAlgo(ArrayList<Edge> graph [] , int V){
        //Step 1 :- topological sorting
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                topSort(graph,visited,s,i);
            }
        }

        //Step 2 :- Transpose the Graph
        ArrayList<Edge> transGraph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
            transGraph[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            for(Edge e : graph[i]){
                transGraph[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        
        //Step 3 :- dfs on transpose graph using topological sort stack

        while (!s.empty()) {
            int curr = s.pop();
            if(!visited[curr]){
                dfs( transGraph , visited , curr);
                System.out.println();
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosarajusAlgo(graph, V);
    }
}
