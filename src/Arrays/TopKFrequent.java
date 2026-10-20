package Arrays;
import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] res = topKfrequent(nums,k);
        for(int freqs : res)
            System.out.print(freqs+" ");
    }
  public static int[] topKfrequent(int[] nums, int k){
      int n = nums.length;
        int[] res = new int[k];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.merge(num,1,Integer::sum);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) -map.get(b)
        );
        for(int arr:map.keySet()){
            heap.add(arr);
            if(heap.size() > k){
                heap.poll();
            }
        }
        for(int i = k-1; i >= 0; i--) {
            res[i] = heap.poll();
        }
        return res;
    }
}
