import java.util.Arrays;

public class BinarySearchInForest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        System.out.println(collectWoods(arr, arr.length, 2));
    }

    //  Time Complexity : (nlog(n))
    //  Auxiliary Space : O(1)
    public static int collectWoods(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int low = arr[0];
        int high = arr[n-1];
        while (low<=high) {
            int mid = (low+high)/2;
            int collected = collected(arr, n, mid);
            if (collected==k) {
                return mid;
            }
            else if (collected>k){
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int collected(int[] arr, int n, int ans) {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i]-ans;
        }
        return sum;
    }
}
