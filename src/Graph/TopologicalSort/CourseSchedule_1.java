package Graph.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule_1 {
    public static void main(String[] args) {
        int[][] prereq = { {5,0},{5,2},{4,0},{4,1},{2,3},{3,1}
        };
        int V = 6;
        CourseSchedule_1 c = new CourseSchedule_1();
        boolean ans = c.canFinishbyKahn(prereq,V);
        List<Integer> ans2 = c.canFinishbyKahn2(prereq,V);
        System.out.println(ans2);

    }
    public boolean canFinish(int[][] prereq, int V){
        boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : prereq){
            adj.get(e[1]).add(e[0]);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(dfs(adj,i,visited,stack)){
                    return false;
                }
            }
        }
        return true;

    }
    private boolean dfs(List<List<Integer>> adj, int node, boolean[] visited, boolean[] stack){
        visited[node] = true;
        stack[node] = true;
        for(int neighbor : adj.get(node)){
            if(!visited[neighbor]){
                if(dfs(adj,neighbor,visited,stack)){
                    return true;
                }
            } else if (stack[neighbor]) {
                return true;
            }
        }
        stack[node] = false;
        return false;
    }

    //Approach 2, Kahn algo
    public static boolean canFinishbyKahn(int[][] prereq,int V){
        int[] indegree = new int[V];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : prereq){
            adj.get(e[1]).add(e[0]);
            indegree[e[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int processed = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            processed++;
            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0)
                {
                    queue.offer(neighbor);
                }
            }
        }
        return processed == V;
    }


// Course Schedule 2

    public static List<Integer> canFinishbyKahn2(int[][] prereq,int V){
        int[] indegree = new int[V];
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : prereq){
            int u = e[0];
            int v = e[1];

            adj.get(u).add(v);
           indegree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);

            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0)
                {
                    queue.offer(neighbor);
                }
            }
        }

       if(res.size() != V){
           return new ArrayList<>();

       }
        return res;
    }

}
