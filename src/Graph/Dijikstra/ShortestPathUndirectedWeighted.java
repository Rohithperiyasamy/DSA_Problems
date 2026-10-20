package Graph.Dijikstra;

import java.util.*;

public class ShortestPathUndirectedWeighted {
    public static void main(String[] args) {

        int[][] edges =  {{0,1,1},{0,2,4},{1,2,2},{1,3,5},{2,3,1}};
        int V = 4;
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
            adj.get(e[1]).add(new int[]{e[0],e[2]});
        }
        int[] res = dijiskstra(adj,V,0);
        for(int r : res)
        System.out.print(r+" ");

    }
    public static int[] dijiskstra(List<List<int[]>> adj, int V, int source){
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{0,source});
        boolean[] visited = new boolean[V];
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
                    pq.offer(new int[] {dist[neighbor], neighbor});
                }
            }


        }

return dist;

    }
}
