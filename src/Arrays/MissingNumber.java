package Arrays;

public class MissingNumber {
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,6,8,10};

        int n = 10;
        boolean[] mark = new boolean[n+1];
        for(int i = 0; i < arr.length; i++){
            mark[arr[i]] = true;
        }
        for(int i = 1; i <= n; i++){
            if(!mark[i]){
                System.out.print(i+" ");
            }
        }


    }

}

//int n = arr.length + 1;
//        int total = n * (n+1) / 2;
//        int sum = 0;
//        for(int num : arr)
//        {
//            sum += num;
//        }
//        System.out.print(total - sum);
