public class LongestCommonSpanWithSameSumInTwoBinaryArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 0, 1, 0, 0, 1};
        System.out.println(maxCommon(arr1, arr2));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int maxCommon(int[] array1, int[] array2) {
        int result = 0;
        for (int i=0; i<array1.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j=i; j<array1.length; j++) {
                sum1 += array1[j];
                sum2 += array2[j];
                if (sum1 == sum2) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }
}
