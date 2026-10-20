package Greedy;

public class JumpGame {
    static void main() {
        int[] nums = {2,3,1,1,4};
        System.out.print(jumpGame(nums));
    }
    static boolean jumpGame(int[] nums){
        int r = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > r){
                return false;
            }
            r = Math.max(r, i + nums[i]);
        }
        return true;
    }
}
