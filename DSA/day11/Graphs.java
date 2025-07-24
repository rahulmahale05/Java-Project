package DSA.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import DSA.day7.queue;

public class Graphs {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void BFS(ArrayList<Edge> graph[], int V , boolean[] visited , int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(visited[curr] == false){
                System.out.print(curr + " ");
                visited[curr] = true;
                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge> graph[] , boolean[] visited , int curr){
        System.out.print(curr+" ");
        visited[curr] = true;
        for (Edge e : graph[curr]) {
            if(visited[e.dest] == false){
                DFS(graph, visited, e.dest);
            }
        }
    }
    public static void pathSrcToTar(ArrayList<Edge> graph[] ,boolean visited[], String path , int curr , int tar){
        if(curr == tar) {
            System.out.println(path);
            return;
        }
        for (Edge e : graph[curr]) {
            if(!visited[e.dest]){
                visited[curr] = true;
                pathSrcToTar(graph, visited, path+e.dest, e.dest, tar);
                visited[curr] = false;
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // for (Edge e : graph[2]) {
        //     System.out.print(e.dest+" ");
        // }
        boolean visited[] = new boolean[7];
        // for (int i = 0; i < visited.length; i++) {
        //     if(visited[i] == false){
        //         // BFS(graph,V,visited,i);
        //         DFS(graph, visited, i);
        //     }
        // }
        pathSrcToTar(graph, visited, "0" , 0, 5);
    }
}

