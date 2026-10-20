package Arrays;

public class CountSubarray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(subcount(arr));
    }
    static int subcount(int[] arr)
    {
        int n = arr.length;

        int totsub = n * (n + 1) / 2;
        return totsub;
    }
}
