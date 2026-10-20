package BinarySearch_;

public class SplitArraylargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.print(splitsum(nums,k));
    }
    static int splitsum(int[]  nums, int k){
        int low = 0, high = 0;
        for(int n : nums){
            low = Math.max(low,n);
            high += n;
        }
        while(low < high){
            int mid = low + (high - low) / 2;
            if(canSplit(nums,mid,k)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean canSplit(int[] nums, int maxSum, int k){
        int parts = 1, current = 0;
        for(int n : nums){
            if(current + n > maxSum){
                parts++;
                current = 0;
            }
            current += n;
        }
        return parts <= k;
    }
}
