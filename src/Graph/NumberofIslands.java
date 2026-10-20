package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}

        };
        NumberofIslands n = new NumberofIslands();
        int ans = n.numberofLands(grid);
        System.out.println(ans);

        }
       public int numberofLands(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[row][col];
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == '1' && !visited[r][c]){
                    count++;
                    DFS(grid,visited,r,c); // Bfs and Dfs can use 
                }
            }
        }
        return count;
    }
    private void Bfs(char[][] grid, boolean[][] visited, int sr,int sc, int[] dr, int[] dc){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        visited[sr][sc] = true;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            for(int d = 0; d < 4; d ++){
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length &&
                grid[nr][nc] == '1' && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }

    }
    private void DFS(char[][] grid, boolean[][] visited, int r , int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length ||
        grid[r][c] == '0' || visited[r][c]){
            return;
        }
        visited[r][c] = true;
        DFS(grid,visited,r-1, c);
        DFS(grid,visited,r+1, c);
        DFS(grid,visited,r, c-1);
        DFS(grid,visited,r, c+1);
    }

}
