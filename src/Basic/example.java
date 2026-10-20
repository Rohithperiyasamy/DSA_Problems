package Basic;

import java.util.HashSet;

public class example {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        float median = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int s = 0, e = arr.length;

            int mid = s + (e - s) / 2;
            median = arr[mid] + arr[mid] / 2;

        System.out.println(arr[mid] + " "+ arr[mid-1]);
        System.out.print(median);
    }
}
