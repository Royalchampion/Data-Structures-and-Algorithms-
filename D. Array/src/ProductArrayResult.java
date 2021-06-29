import java.util.Arrays;

public class ProductArrayResult {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(result(arr)));
        System.out.println(Arrays.toString(resultEfficient(arr)));
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(n)
    public static int[] resultEfficient(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        int i;

        left[0] = 1;
        right[n-1] = 1;

        for (i=1; i<n; i++) {
            left[i] = left[i-1]*arr[i-1];
        }

        for (i=n-2; i>=0; i--) {
            right[i] = right[i+1]*arr[i+1];
        }

        for (i=0; i<n; i++) {
            prod[i] = left[i]*right[i];
        }
        return prod;
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
