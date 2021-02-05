import java.util.Arrays;

public class MinimumDifferenceInAnArray {
    public static void main(String[] args) {
        System.out.println(minimumDifferenceInAnArray(new int[]{10}));
    }

//    Time Complexity : O(nlogn)
//    Auxiliary Space : O(1)
    public static int minimumDifferenceInAnArray(int arr[]) {
        if (arr.length==1) {
            return -1;
        }
        Arrays.sort(arr);
        int res = arr[1] - arr[0];
        for (int i=1; i<arr.length; i++) {
            res = Math.min(res, arr[i]-arr[i-1]);
        }
        return res;
    }
}
