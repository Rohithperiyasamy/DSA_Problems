package Arrays;
import java.util.Arrays;
public class ProductOfArrayExceptself {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(ArraySelf(nums)));
    }
    static int[] ArraySelf(int[] nums)
    {
        int n = nums.length;
        int[] answer = new int[n];
        int prodR = 1;
        int prodL = 1;
        for(int i = n-1; i >= 0; i--)
        {
            answer[i] = prodR;
            prodR = prodR * nums[i];
        }
        for(int i = 0; i < n; i++)
        {
            answer[i] = answer[i] * prodL;
            prodL = prodL * nums[i];
        }
        return answer;
    }
}
