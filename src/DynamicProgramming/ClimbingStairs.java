package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbingstairs(n));
    }
    static int climbingstairs(int n){
        if(n <= 2) return n;
        int prev1 = 2, prev2 = 1;
        for(int i = 3; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
