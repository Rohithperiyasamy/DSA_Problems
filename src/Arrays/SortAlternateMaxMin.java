package Arrays;
import java.util.*;
public class SortAlternateMaxMin {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,2};
        Arrays.sort(arr);
        int n = arr.length-1;
        int left = 0;
        int right = n-1 ;
        int[] result = new int[n];
        int index = 0;
        while(left <= right)
        {
            if(left == right)
            {
                result[index++] = arr[left];
            }
            else{
                result[index++] = arr[right--];
                result[index++] = arr[left++];
            }
        }
        System.out.print(Arrays.toString(result));

    }
}
