package Greedy;

public class JumpGame2 {
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        System.out.print(jumpGame2(nums));
    }
    static int jumpGame2(int[] nums){
        int r = 0,currentEnd = 0,jump= 0;
        for(int i = 0; i < nums.length - 1;i++){
            r = Math.max(r,i+nums[i]);
            if(i == currentEnd){
                jump++;
                currentEnd = r;
            }
        }
        return jump;
    }
}
