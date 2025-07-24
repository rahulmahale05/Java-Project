package DSA.day11;

import java.util.ArrayList;
import java.util.Stack;

public class Graphs3 {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(3, 0));
        graph[4].add(new Edge(3, 1));

        graph[5].add(new Edge(3, 0));
        graph[5].add(new Edge(3, 2));

    }
    public static void topSortUtil(ArrayList<Edge> graph[] ,boolean visited[],Stack<Integer> stack, int curr){
        visited[curr] = true;
        for(Edge e : graph[curr]){
            if(!visited[e.dest]){
                topSortUtil(graph, visited, stack, e.dest);
            }
        }
        stack.push(curr);
    }
    public static void topSort(ArrayList<Edge> graph[], int V){
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if(!visited[i])
                topSortUtil(graph, visited, stack, i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()+" ");
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topSort(graph,V);
    }
}
