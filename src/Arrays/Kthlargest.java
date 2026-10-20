package Arrays;

import java.util.PriorityQueue;
import java.util.Collections;

public class Kthlargest {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println("Kth Largest number is :" +kthlarge(arr,k));
        System.out.println("Kth Smallest number is :" +kthsmall(arr,k));
    }
    static int kthlarge(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
            return pq.peek();
    }
    static int kthsmall(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr)
        {
            pq.add(num);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
