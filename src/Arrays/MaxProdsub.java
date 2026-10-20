package Arrays;
// It is a LeetCode Problem , to find the maximum product of subarray
public class MaxProdsub {
    public static void main(String[] args)
    {
        int[] nums = {2,3,-2,4};
        System.out.print(MaxProduct(nums));
    }
    static int max(int a, int b , int  c){
        return Math.max(a, Math.max(b,c));
    }
    static int min(int a, int b , int  c){
        return Math.min(a, Math.min(b,c));
    }
    static int MaxProduct(int[] nums)
    {
        int currmin = nums[0];
        int currmax = nums[0];
        int maxpro = nums[0];
        for(int i = 1; i < nums.length; i ++)
        {
            int temp = max(nums[i], nums[i] * currmax, nums[i] * currmin );
            currmin = min(nums[i], nums[i] * currmax, nums[i] * currmin );
            currmax = temp;
            maxpro = Math.max(maxpro,currmax);
        }
        return maxpro;
    }
}
