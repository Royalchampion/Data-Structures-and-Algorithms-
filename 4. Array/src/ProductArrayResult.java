import java.util.Arrays;

public class ProductArrayResult {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(result(arr)));
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public static int[] result(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i=0, temp=1; i<n; i++) {
            result[i] = temp;
            temp *= arr[i];
        }
        for (int i=n-1, temp=1; i>=0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }
        return result;
    }
}
