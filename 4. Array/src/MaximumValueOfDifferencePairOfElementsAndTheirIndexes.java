public class MaximumValueOfDifferencePairOfElementsAndTheirIndexes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(maxValue(arr, arr.length));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int maxValue(int[] arr, int N) {
        int res = 0;
        for (int i=0; i<N; i++) {
            for (int j=i; j<N; j++) {
                res = Math.max(res, (Math.abs(arr[i]-arr[j]) + Math.abs(i-j)));
            }
        }
        return res;
    }
}
