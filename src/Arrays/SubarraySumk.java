package Arrays;
import java.util.HashMap;

public class SubarraySumk {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,4,5,3};
        int k = 6;
        System.out.println(subarraysum(arr,k));
    }
    static int subarraysum(int[] arr,int k)
    {
        int sum = 0,count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : arr)
        {
            sum += num;
            if(map.containsKey(sum - k))
            {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }


        return count;
    }
}
