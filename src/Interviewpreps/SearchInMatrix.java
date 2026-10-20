package Interviewpreps;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {8,9,10}
        };
        int target  = 6;
        int[] res = isthere(matrix,target);
        for(int result : res) {
            System.out.print(result +" ");
        }
    }
    static int[] isthere(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid/n;
            int col = mid%n;
            int val = matrix[row][col];

            if(val == target){
                return new int[]{row,col};
            }
            else if(val < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return new int[]{-1,-1};

    }
}
