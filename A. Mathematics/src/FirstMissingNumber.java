public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        System.out.println(findFirstMissingNumber(nums));
    }

    //  Time Complexity:O(n)
    //  Auxiliary Space:O(1)
    public static int findFirstMissingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int numsTotal = n*(n+1)/2;
        for(int i=0; i<n; i++) {
            sum += nums[i];
        }
        return numsTotal-sum;
    }
}
