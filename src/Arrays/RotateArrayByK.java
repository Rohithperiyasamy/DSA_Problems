package Arrays;
import java.util.Arrays;
public class RotateArrayByK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =  3;
        System.out.println(Arrays.toString(rotatedByK(nums,k)));
    }
    public static int[] rotatedByK(int[] nums, int k)
    {
        int n = nums.length;
        reverseRotate(nums, 0, n - 1);
        reverseRotate(nums,0,k-1);
        reverseRotate(nums,k,n-1);
        return nums;
    }
    public static void reverseRotate(int[] nums, int start, int end)
    {
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
}
