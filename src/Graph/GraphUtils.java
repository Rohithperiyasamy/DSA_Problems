package Graph;

import java.util.*;

public class GraphUtils {

    // Build adjacency list from edges — UNDIRECTED
    public static List<List<Integer>> buildGraph(int n, int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return adj;
    }

    // Build adjacency list — DIRECTED
    public static List<List<Integer>> buildDirectedGraph(int n, int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);   // only one direction
        }
        return adj;
    }

    // BFS — returns visit order
    public static List<Integer> bfs(List<List<Integer>> adj, int start, int n){
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        visited[start] = true;
        queue.offer(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);

            for(int next : adj.get(node)){
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        return result;
    }

    // DFS — returns visit order
    public static List<Integer> dfs(List<List<Integer>> adj, int start, int n){
        boolean[] visited = new boolean[n];
        List<Integer> result = new ArrayList<>();
        dfsHelper(adj, start, visited, result);
        return result;
    }

    private static void dfsHelper(List<List<Integer>> adj, int node,
                                  boolean[] visited, List<Integer> result){
        visited[node] = true;
        result.add(node);

        for(int next : adj.get(node)){
            if(!visited[next]){
                dfsHelper(adj, next, visited, result);
            }
        }
    }

    // Print adjacency list — for debugging
    public static void printGraph(List<List<Integer>> adj){
        for(int i = 0; i < adj.size(); i++){
            System.out.println(i + " -> " + adj.get(i));
        }
    }
}