package Interviewpreps;

public class ContainerWithMostWater {
    static void main() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.print(containerWater(height));
    }
    static int containerWater(int[] height){
        int left = 0;
        int maxWater = 0;
        int right = height.length-1;
        int currentLevel = 0;
        while(left < right){
            currentLevel = Math.min(height[left],height[right]) * (right - left);
            maxWater = Math.max(currentLevel,maxWater);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
