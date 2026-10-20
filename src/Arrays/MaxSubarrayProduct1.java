package Arrays;

//In this Problem solved with O(n^2) time and O(n) Space.

public class MaxSubarrayProduct1 {
    public static void main(String[] args)
    {
        int [] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxpro(arr));
    }
    static int maxpro(int[] arr)
    {
        int maxpro = arr[0];


        for(int i = 0; i < arr.length; i++)
        {
            int mul = 1;
            for(int j = i; j < arr.length; j++)
            {
                mul  *= arr[j];
                maxpro = Math.max(maxpro, mul);
            }
        }
        return maxpro;
    }
}
