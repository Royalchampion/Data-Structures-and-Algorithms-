public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 15, 10, 8, 6, 12, 9, 18};
        findNextGreaterElement(arr, arr.length);
    }

    //  Time Complexity : O(n*n);
    //  Auxiliary Space : O(1)
    public static void findNextGreaterElement(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            int j;
            for(j=i+1; j<n; j++) {
                if (arr[j]>arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j==arr.length) {
                System.out.print(-1 + " ");
            }
        }
    }
}
