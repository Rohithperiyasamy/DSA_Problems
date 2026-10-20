package Graph.Dijikstra;
import java.util.*;

public class NetworkDelayDirectedWeighted {
    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        System.out.println(networkDelay(times,n,k));
    }
    static int networkDelay(int[][] times, int n, int k){
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <= n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : times){
            int u = e[0], v = e[1], w = e[2];
            adj.get(u).add(new int[]{v,w});
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[] {0,k});
        boolean[] visited = new boolean[n+1];
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0];
            int node = curr[1];
            if(visited[node]) continue;
            visited[node] = true;
            for(int[] edge : adj.get(node)){
                int neighbor = edge[0];
                int weight = edge[1];
                if(!visited[neighbor] && dist[node] + weight < dist[neighbor]){
                    dist[neighbor] = dist[node] + weight;
                    pq.offer(new int[]{dist[neighbor], neighbor});
                }
            }
        }
        int maxdist = 0;
        for(int i = 1; i <= n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            maxdist = Math.max(maxdist,dist[i]);
        }
        return maxdist;
    }
}
