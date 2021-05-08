public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 30, 10, 5, 15};
        findPreviousGraterElement(arr, arr.length);
    }

    //  Time Complexity : O(n**2)
    //  Auxiliary Space : O(1)
    public static void findPreviousGraterElement(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            int j;
            for (j=i-1; j>=0; j--) {
                if (arr[i]<arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1) {
                System.out.print(-1 + " ");
            }
        }
    }
}
