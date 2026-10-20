package Arrays;
import java.util.HashSet;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args)
    {
        int[][] arr = {
                {1, 2, 3},
                {5, 0, 7},
                {9, 8, 4}
        };
        SetMatrixZero sm = new SetMatrixZero();
        sm.setmat(arr);
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
    public void setmat(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        HashSet<Integer> rowmat = new HashSet<>();
        HashSet<Integer> colmat = new HashSet<>();
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(arr[i][j] == 0)
                {
                    rowmat.add(i);
                    colmat.add(j);
                }
            }
        }
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(rowmat.contains(i) || colmat.contains(j))
                {
                    arr[i][j] = 0;
                }

            }
        }
    }
}
