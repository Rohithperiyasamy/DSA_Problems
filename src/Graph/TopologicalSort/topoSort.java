package Graph.TopologicalSort;
import java.util.*;

//It is DIRECTED ACYCLIC GRAPH (DAG) , most important for DSA


public class topoSort {
    public static void main(String[] args) {
        int[][] edges = {
                {5,0},{5,2},{4,0},{4,1},{2,3},{3,1}
        };
        int V = 6;
        System.out.print("Before the topological sort: ");
        for(int i = 0; i < edges.length; i++){
            for(int j = 0; j < edges[0].length; j++){
                System.out.print(edges[i][j]+" ");
            }
            System.out.println();
        }

       
        topoSort t = new topoSort();
        List<Integer> list = t.toposort(edges,V);
        System.out.println("After the sort: "+list+" ");
        System.out.println("Above Graph is a Topological Sort :"+" "+isTopo(list,edges,V));


    }
    private static boolean isTopo(List<Integer> res, int[][] edges, int V){
        int[] position = new int[V];
        for(int i = 0; i < res.size(); i++){
            position[res.get(i)] = i;
        }
        for(int[] e : edges){
            int u = e[0], v = e[1];
            if(position[u] >= position[v]){
                return false;
            }

        }
        return true;
    }
    public List<Integer> toposort(int[][] edges,int V){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i  < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
        }
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(adj, i, visited, stack);

            }
        }
            while(!stack.isEmpty()){
                res.add(stack.pop());
            }

        return res;
    }
    private void dfs(List<List<Integer>> adj, int node, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(adj, neighbor, visited, stack);

            }
        }

        stack.push(node);
    }
}

