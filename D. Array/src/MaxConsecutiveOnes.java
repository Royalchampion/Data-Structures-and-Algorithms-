public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr, 3));
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int i = 0;
        int zeroCount = 0;
        for(int j=0; j<nums.length; j++) {
            if(nums[j]==0) {
                zeroCount++;
            }

            while(zeroCount>k) {
                if(nums[i]==0) {
                    zeroCount--;
                }
                i++;
            }

            max = Math.max(max, j-i+1);
        }
        return max;
    }
}
