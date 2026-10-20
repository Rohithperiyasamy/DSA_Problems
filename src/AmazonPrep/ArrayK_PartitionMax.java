//package AmazonPrep;
//
//public class ArrayK_PartitionMax {
//    public static void main(String[] args) {
//        int[] arr = {1,2,2,3,1,1,1};
//        int k = 2;
//        int res[] = arrayKpartitionMax(arr,k);
//        for(int x : res)
//        System.out.print(x+" ");
//    }
//    static int[] arrayKpartitionMax(int[] arr, int k){
//        int max = 0;
//        int n = arr.length;;
//        int left = 0;
//        int right = n-1;
//        int[] res = new int[arr.length];
//        int j = 0;
//        while(left < right){
//            for(int i = 1; i <= k; i++){
//                max = Math.max(max,arr[i]);
//                res[j++] = max;
//                i++;
//            }
//           left++;
//        }
//        return res;
//    }
//}
