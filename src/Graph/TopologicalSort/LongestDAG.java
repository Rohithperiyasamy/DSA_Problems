package Graph.TopologicalSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
class LongestDAG {
    public static void main(String[] args) {
        int[][] edges =
                {{0,1,2},{0,4,1},{1,2,3},{4,2,2},{2,3,6},{4,5,4},{5,3,1}};
        int V = 6;
        int src = 0;
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0 ; i < V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(new int[] {e[1],e[2]});

        }
        int[] res = longestDAG(adj,V,src);
        for(int r : res) {
            System.out.print(r+" ");
        }
    }

static int[] longestDAG(List<List<int[]>> adj, int V, int src){
    List<Integer> topoOrder  = topoSort(adj,V);
    int[] dist = new int[V];
    Arrays.fill(dist,Integer.MIN_VALUE);
    dist[src] = 0;
    for(int node : topoOrder){
        if(dist[node] != Integer.MIN_VALUE){
            for(int[] edge : adj.get(node)){
                int neighbor = edge[0];
                int weight = edge[1];
                if(dist[node] + weight > dist[neighbor]){
                    dist[neighbor] = dist[node] + weight;
                }
            }
        }
    }

    return dist;
}
private static List<Integer> topoSort(List<List<int[]>> adj, int V){
    boolean[] visited = new boolean[V];
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < V; i++){
        if(!visited[i]){
            dfs(adj,i,visited,stack);
        }
    }
    List<Integer> result = new ArrayList<>();
    while(!stack.isEmpty()){
        result.add(stack.pop());
    }
    return result;
}
static void dfs(List<List<int[]>> adj, int node, boolean[] visited, Stack<Integer> stack){
    visited[node] = true;
    for(int[] edge : adj.get(node)){
        int neighbor = edge[0];

        if(!visited[neighbor]){
            dfs(adj,neighbor,visited,stack);
        }
    }
    stack.push(node);
}
}