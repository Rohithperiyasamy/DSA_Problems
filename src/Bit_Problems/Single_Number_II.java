package Bit_Problems;

public class Single_Number_II {
    public static void main(String[] args) {
        int[] nums = {4,4,4,2,2,2,99};
        int result = 0;
        for(int i = 0; i < 32; i++){
            int bitCount = 0;
            for(int n : nums){
                bitCount += (n >> i) & 1;
            }
            if(bitCount % 3 != 0){
                result += (1 << i);
            }
        }
        System.out.println(result);
    }
}
