public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        subArray(new int[]{15, 2, 4, 8, 9, 5, 10, 23}, 23);
    }

//  Time Complexity : O(n*n)
//  Auxiliary Space : O(1)
    public static int subArray(int[] array, int sum) {
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
}
