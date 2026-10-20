package Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivot(arr));
    }
    static int pivot(int[] arr)
    {
        int tot_sum = 0;
        for(int i = 0; i < arr.length;  i++)
        {
            tot_sum += arr[i];
        }
        int left_sum = 0;
        for(int i = 0; i< arr.length; i++)
        {
            if(i != 0)  left_sum += arr[i - 1];
            if(tot_sum - left_sum - arr[i] == left_sum)
            {
                return i;
            }


        }
        return -1;
    }
}
