package Greedy;

import java.util.PriorityQueue;
public class MinCostRopes {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 6, 9};
        System.out.println(minimumCostRope(nums));
    }
    static int minimumCostRope(int[] nums){
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long rope : nums){
            pq.offer(rope);
        }
        int totalCost = 0;
        while(pq.size() > 1)
        {
            long first = pq.poll();
            long second = pq.poll();
            long cost = first + second;
            totalCost += cost;
            pq.offer(cost);
        }
        return totalCost;
    }
}
