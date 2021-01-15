public class PrefixSumProblem {
    public static void main(String[] args) {
        System.out.println(calcSum(new int[]{2, 8, 3, 9, 6, 5, 4}, 1, 3));
    }

    public static int calcSum(int arr[], int left, int right) {
        int sum = 0;
        for (int i=left; i<=right; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
