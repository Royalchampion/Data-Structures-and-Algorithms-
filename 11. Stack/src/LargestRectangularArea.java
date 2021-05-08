public class LargestRectangularArea {
    public static void main(String[] args) {
        int arr[] = new int[]{6, 2, 5, 4, 1, 5, 6};
        System.out.println(getMaxArea(arr, arr.length));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int getMaxArea(int[] arr, int n) {
        int res = 0;
        for (int i=0; i<n; i++) {
            int curr = arr[i];
            for (int j=i-1; j>=0; j--) {
                if (arr[j]>=arr[i]) {
                    curr += arr[i];
                }
                else {
                    break;
                }
            }
            for (int j=i+1; j<n; j++) {
                if (arr[j]>=arr[i]) {
                    curr += arr[i];
                }
                else {
                    break;
                }
            }
            res = Math.max(curr, res);
        }
        return res;
    }
}
