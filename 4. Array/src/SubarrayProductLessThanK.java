public class SubarrayProductLessThanK {
    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int prod = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]<k) {
                count++;
            }
            prod = nums[i];
            for(int j=i+1; j<n; j++) {
                prod *= nums[j];
                if(prod<k) {
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
