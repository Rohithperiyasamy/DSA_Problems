package Arrays;

import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,1,2,3,4,2,5,6,7,6};


        HashMap<Integer, Integer> mp = new HashMap<>();
        int res = Integer.MIN_VALUE;
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);

        }
        System.out.print(mp);

    }



}
