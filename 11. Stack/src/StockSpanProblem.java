public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{18, 12, 13, 14, 11, 16};
        printSpan(arr, arr.length);
    }

    //  Time Complexity : O(n**2)
    //  Auxiliary Space : O(1)
    public static void printSpan(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            int span = 1;
            for (int j=i-1; j>=0; j--) {
                if (arr[j]<=arr[i]) {
                    span++;
                }
            }
            System.out.print(span+" ");
        }
    }
}
