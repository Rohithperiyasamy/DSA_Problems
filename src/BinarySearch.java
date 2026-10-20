
public class BinarySearch
{
        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 6, 7, 8};
            int target = 7;
            System.out.println(search(arr,target));
        }
        static int search(int[] arr, int target)
        {
            int start = 0;
            int end = arr.length-1;
            while(start < end)
            {
                int mid = start + (end - start) / 2;
                if(target == arr[mid])
                {
                    return mid;
                }
                if(target < arr[mid])
                {
                    start = mid - 1;
                }
                else {
                    end = mid + 1;
                }
            }
            return -1;
        }
}



