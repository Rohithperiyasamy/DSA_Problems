package Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,3,5};
        int m = 3, n = 3;
        mergearray(nums1,nums2,m,n);
        for(int i = 0; i < m+n; i++)
        {
            System.out.print(nums1[i]+" ");
        }
    }
    static void mergearray(int[] nums1, int[] nums2,int n, int m)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0)
        {
            if(i >= 0 && nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
   