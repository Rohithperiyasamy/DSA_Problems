package Arrays;
import java.util.Arrays;
public class RemoveDUplicatesII {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5,1};
        System.out.println(removeII(nums));
    }
    static int removeII(int[] nums)
    {
        int i = 0;
        Arrays.sort(nums);
        for(int n : nums)
        {
            if(i < 2 || n != nums[i - 2])
            {
                nums[i++] = n ;
            }


        }
        return i;
    }
}
