package Interviewpreps;
import java.util.*;
//Given an array where each element has a color (1 to C),
//Find the shortest contiguous subarray containing all C colors
//at least once — return -1 if impossible.
public class ShortestSubarrayContainsAllcolorsofC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Result is :"+" "+MinSubarraycolors(arr,c,n));
    }
    static int MinSubarraycolors(int[] arr,int c,int n){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int uniqueColor = 0;
        int left = 0;
        int minlen = Integer.MAX_VALUE;
        for(int right = 0; right < n; right++) {
            if (arr[right] >= 1 && arr[right] <= c) {
                freq.merge(arr[right], 1, Integer::sum);
                if (freq.get(arr[right]) == 1) {
                    uniqueColor++;
                }
            }
            while (uniqueColor == c) {
                minlen = Math.min(minlen, right - left + 1);
               if (arr[left] >= 1 && arr[left] <= c){
                   freq.merge(arr[left], -1,Integer::sum);
                   if(freq.get(arr[left]) == 0 ) uniqueColor--;
               }
               left++;
            }
        }
        return minlen;
    }
}

