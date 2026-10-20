package Arrays;

public class MajorityElement {
    public static void main(String[] args)
    {
        int[] arr = {1,3,3,4,3,3};
        System.out.print(majority(arr));
    }

    static int majority(int[] arr) {
        int cand = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                cand = num;
            }
            if (cand == num) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == cand) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return cand;  // Majority element
        }
        return -1;  // No majority element
    }
}