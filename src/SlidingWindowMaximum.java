
//Most important problem ever

// Google, Amazon, Microsoft etc...

import java.util.ArrayDeque;
import java.util.ArrayList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        arr = maxSlide(nums,k);
        for(int i = 0; i< arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
    static ArrayList<Integer> maxSlide(int[] nums,int k)
    {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++)
        {
            if(!dq.isEmpty() && dq.peekFirst() == i-k)
            {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
            {
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k - 1)
            {
                result.add(nums[dq.peekFirst()]);
            }
        }
        return result;
    }
}
