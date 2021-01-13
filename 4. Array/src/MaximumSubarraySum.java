public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1, -2, 3, -1, 2}));
    }

//    Time Complexity : O(n^2)
//    Auxiliary Space : O(1)
    public static int maxSum(int arr[]) {
        int res = arr[0];
        for (int i=0; i<arr.length; i++) {
            int curr = 0;
            for (int j=i; j<arr.length; j++) {
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
