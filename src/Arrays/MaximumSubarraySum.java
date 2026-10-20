package Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args)
    {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(max(arr));

    }
    static int max(int[] arr)
    {
        int cursum = 0;
        int maxsum = 0;
        for(int i = 1; i < arr.length; i++)
        {
            cursum = Math.max(arr[i], cursum+arr[i] );
            maxsum = Math.max(cursum, maxsum);
        }
        return maxsum;
    }
}
