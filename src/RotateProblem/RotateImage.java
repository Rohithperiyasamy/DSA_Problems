package RotateProblem;
import java.util.Arrays;
public class RotateImage
{
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3},
                           {4,5,6},
                           {7,8,9}
        };
        System.out.println("Before Rotation :");
        for(int[] row : matrix)
            System.out.println(Arrays.toString(row));
        RotateImage ri = new RotateImage();
        ri.imagerotate(matrix);
        System.out.println("After Rotation :");
        for(int[] row : matrix)
                System.out.println(Arrays.toString(row));
    }
    public void imagerotate(int[][] matrix)
    {
        transpose(matrix);
        reverse(matrix);
    }
    private void transpose(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    private void reverse(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            int left = 0;
            int right = matrix.length-1;
            while(left < right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
