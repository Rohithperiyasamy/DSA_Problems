package Graph;

import java.util.ArrayList;
import java.util.List;

public class DetectCycle {

    boolean[][] visited;
    int rows, cols;
    public static void main(String[] args) {
        char[][] grid = {
                {'b','b','b'},
                {'b','b','b'},
                {'b','b','a'}
        };

        int[][] edges = { {0,1},{1,2},{2,0}

        };
        int V = 3;
        DetectCycle d = new DetectCycle();
        boolean ans = d.detectCycleUndirected(grid);
        System.out.println("Undirected graph ");
        System.out.println("Yes, the above Undirectedgraph is a cyclic :"+" "+ans);
        System.out.println("Directed Graph");
      boolean ans2 =   d.detectDirected(edges,V);
        System.out.println("The Directed graph is:"+" "+ans2);
    }
    public boolean detectCycleUndirected(char[][] grid){
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        for(int r = 0; r < rows; r ++){
            for(int c = 0; c < cols; c ++){
                if(!visited[r][c]){
                    if(dfs(grid,r,c,-1,-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(char grid[][], int r, int c, int pr, int pc){
        visited[r][c] = true;
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        for(int d = 0; d < 4; d++){
            int nr = r + dr[d];
            int nc = c + dc[d];
            if(nr < 0 || nr >= rows || nc < 0 || nc >= cols) continue;
            if(grid[nr][nc] != grid[r][c]) continue;
            if(nr == pr && nc == pc) continue;
            if(visited[nr][nc]){
                return true;
            }
              if(dfs(grid,nr,nc,r,c)){
                return true;
            }
        }
        return false;
    }


    //Directed graph
    public boolean detectDirected(int[][] edges, int V){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
            
        }
        for(int [] e : edges){
            adj.get(e[0]).add(e[1]);  
        }
        boolean[] visited = new boolean[V];
        boolean[] inStack = new boolean[V];
        for(int i = 0; i  < V; i++){
            if(!visited[i]){
                if(dfsDirected(adj,i,visited,inStack)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfsDirected(List<List<Integer>> adj, int node, boolean[] visited, boolean[] inStack){
        visited[node] = true;
        inStack[node] = true;
        for(int neighbor : adj.get(node)){
            if(!visited[neighbor]){
                if(dfsDirected(adj,neighbor,visited,inStack)){
                    return true;
                }
            }
            else if(inStack[neighbor]){
                return true;
            }
            
        }
        inStack[node] = false;
        return false;
    }
}
