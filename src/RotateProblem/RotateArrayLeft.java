package RotateProblem;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int k = 2;
        int[] ans = rotateleft(arr,k);
        for(int res: ans)
        System.out.print(res+" ");
    }
    static int[] rotateleft(int[] arr,int k){
         int n = arr.length;
         k = k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    static void reverse(int[] arr,int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
