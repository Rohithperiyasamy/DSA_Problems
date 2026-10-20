package Arrays;
import java.util.HashMap;

public class  CountSubarrayXor {
    public static void main(String[] args)
    {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countXor(arr,k));
    }
    static int countXor(int[] arr, int k)
    {
        int count  = 0;
        int prefixXor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
            prefixXor ^= num;

            if(prefixXor == k)
            {
                count++;
            }
            int requiredXor = prefixXor ^ k;
            if(map.containsKey(requiredXor))
            {
                count += map.get(requiredXor);
            }
            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
        }
        return count;

    }
}
