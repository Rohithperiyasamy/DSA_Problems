package Arrays;

public class MoveZerosLast {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 5, 0, 0, 0, 2, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
