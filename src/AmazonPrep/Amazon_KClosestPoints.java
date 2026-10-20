package AmazonPrep;



import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Amazon_KClosestPoints {
    public static void main(String[] args) {
        int[][] points = { {1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        System.out.print(kClosest(points,k));

    }
static List<List<Integer>> kClosest(int[][] points, int k){
    List<List<Integer>> res = new ArrayList<>();
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(
            a[0]*a[0] + a[1]*a[1],
            b[0]*b[0] + b[1]*b[1]));
    for(int[] arr : points) {
        pq.add(arr);
    }
    while(k > 0) {
        int[] curr = pq.poll();
        List<Integer> list = new ArrayList<>();
        list.add(curr[0]);
        list.add(curr[1]);
        res.add(list);
        k--;
    }
    return res;
}
}
