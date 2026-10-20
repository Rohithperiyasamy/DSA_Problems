package Arrays;

import java.util.HashMap;
import java.util.Arrays;

public class Twosum {
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;

            System.out.print(Arrays.toString(Tsum(nums,target)));
        }

    static int[] Tsum( int[] nums, int target)
    {
        int res[] = {-1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                int arr[] = {map.get(req),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}


