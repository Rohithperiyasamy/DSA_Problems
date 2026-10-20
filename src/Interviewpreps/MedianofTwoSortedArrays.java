package Interviewpreps;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,9};
        System.out.print(findMedian(nums1,nums2));
    }
    static double findMedian(int[] nums1,int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedian(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int start = 0;
        int end = m;
        while (start <= end) {
            int part1 = (start + end) / 2;
            int part2 = (m + n + 1) / 2 - part1;
            int maxleftnum1 = part1 == 0 ? Integer.MIN_VALUE : nums1[part1 - 1];
            int maxleftnum2 = part2 == 0 ? Integer.MIN_VALUE : nums2[part2 - 1];
            int minrightnum1 = part1 == m ? Integer.MAX_VALUE : nums1[part1];
            int minrightnum2 = part2 == n ? Integer.MAX_VALUE : nums2[part2];

            if (maxleftnum1 <= minrightnum2 && maxleftnum2 <= minrightnum1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxleftnum1, maxleftnum2) + Math.min(minrightnum1, minrightnum2)) / 2.0;
                } else {
                    return Math.max(maxleftnum1, maxleftnum2);
                }
            } else if (maxleftnum1 > minrightnum2) {
                end = part1 - 1;
            } else {
                start = part1 + 1;
            }

        }
        throw new IllegalArgumentException();
    }
}
