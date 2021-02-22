public class ContainerWithMostWater {
//    Time Complexity : O(n);
//    Auxiliary Space : O(1);
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int gap = height.length-1;
        while(left<right) {
            if(height[left]<=height[right]) {
                max = Math.max(height[left]*gap, max);
                left++;
                gap--;
            }
            else {
                max = Math.max(height[right]*gap, max);
                right--;
                gap--;
            }
        }
        return max;
    }
}
