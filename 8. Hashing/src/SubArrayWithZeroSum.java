public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = new int[]{4, -3, 2, 1};
        System.out.println(compare(arr, arr.length));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Sum : O(1)
    public static boolean compare(int arr[], int n) {
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += arr[j];
                if (sum==0) {
                    return true;
                }
            }
        }
        return false;
    }
}
