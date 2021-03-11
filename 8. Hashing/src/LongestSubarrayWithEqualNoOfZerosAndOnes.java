public class LongestSubarrayWithEqualNoOfZerosAndOnes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 0, 0};
        System.out.println(find(arr, arr.length));
    }

    public static int find(int[] arr, int n) {
        int result = 0;
        for (int i=0; i<n; i++) {
            int C0 = 0;
            int C1 = 0;
            for (int j=i; j<n; j++) {
                if (arr[j]==0) {
                    C0++;
                }
                else {
                    C1++;
                }
                if (C0==C1) {
                    result = Math.max(result, j-i+1);
                }
            }
        }
        return result;
    }
}
