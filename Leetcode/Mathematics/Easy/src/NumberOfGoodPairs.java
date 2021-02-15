public class NumberOfGoodPairs {
//    Time Complexity : O(n^2)
//    Auxiliary Space : O(1)
    public int findNoOfGoodPairs(int nums[]) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
