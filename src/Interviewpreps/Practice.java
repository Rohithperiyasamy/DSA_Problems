package Interviewpreps;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int n = arr.length;
        List<Integer> inc = new ArrayList<>();
        List<Integer> dec = new ArrayList<>();
        Arrays.sort(arr);
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : arr)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int key : freq.keySet()){
            inc.add(key);
            for(int i = 1; i < freq.get(key); i++)
            {
                dec.add(key);
            }
        }
        Collections.reverse(dec);
        List<Integer> res = new ArrayList<>();
        res.addAll(inc);
        res.addAll(dec);
        System.out.print(res);
    }
}