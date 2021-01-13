public class MaximumDifferenceProblem {
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{3, 4, 10, 12, 11, 9, 22}));
    }

//    Time complexity = O(n^2)
//    Space Complexity = O(1)
    public static int maxDiff(int arr[]) {
        int result = arr[1] - arr[0];
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                result = Math.max(result, arr[j]-arr[i]);
            }
        }
        return result;
    }
}
