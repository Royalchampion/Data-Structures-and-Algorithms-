//  Find the smallest positive integer value that cannot be represented as sum of any subset of a given array.

public class SmallestPositiveIntegerValue {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 10, 11, 15};
        System.out.println(findSmallest(arr, arr.length));
    }

    public static int findSmallest(int[] arr, int n) {
        int res = 1;
        for (int i=0; i<n && arr[i]<=res; i++) {
            res += arr[i];
        }
        return res;
    }
}
