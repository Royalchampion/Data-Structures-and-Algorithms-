import java.util.Arrays;

public class MaximumProductSubarray {
    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public static int max(int[] arr) {
        if (arr.length==0 || arr==null) {
            return 0;
        }
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int temp = max;
            max = Math.max(Math.max(max*arr[i], min*arr[i]), arr[i]);
            min = Math.min(Math.min(temp*arr[i], min*arr[i]), arr[i]);
            if (res>max) {
                res = max;
            }
        }
        return res;
    }
}
