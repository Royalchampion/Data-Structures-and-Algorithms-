public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        subArrayNaive(new int[]{15, 2, 4, 8, 9, 5, 10, 23}, 23);
        int[] arr = new int[]{15, 2, 4, 8, 9, 5, 10, 23};
        subArraySum(arr, arr.length, 23);
    }

//  Time Complexity : O(n*n)
//  Auxiliary Space : O(1)
    public static int subArrayNaive(int[] array, int sum) {
        int currSum, i, j=0;
        for (i=0; i<array.length; i++) {
            currSum = array[i];
            for (j=i+1; j<=array.length; j++) {
                if (currSum==sum) {
                    int p = j-1;
                    System.out.println("The sum found between the indexes " + i + " and " + p);
                    return 1;
                }
                if (currSum > sum || j==array.length) {
                    break;
                }
                currSum += array[j];
            }
        }
        System.out.println("No subarray found!");
        return 0;
    }

//  Time Complexity : O(n)
//  Auxiliary Space : O(1)
    public static int subArraySum(int arr[], int n, int sum) {
        int currSum = arr[0], start=0, i;
        for (i=1; i<=n; i++) {
            while (currSum>sum && start<i-1) {
                currSum = currSum - arr[start];
                start++;
            }
            if (currSum==sum) {
                int p = i-1;
                System.out.println("The indexes found between " + start + " and " + p);
                return 1;
            }
            if (i<n) {
                currSum = currSum + arr[i];
            }
        }
        System.out.println("No indexes found.");
        return 0;
    }
}
