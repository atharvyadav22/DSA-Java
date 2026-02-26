package Arrays;

//Problem No-11 https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){

            int l = Math.min(height[left], height[right]);
            int b = right - left;
            int area = l*b;

            maxArea = Math.max(maxArea, area);

            if(height[left] > height[right]){
                right--;
            }
            else {
                left++;
            }
        }

        return maxArea;
    }
}
