public class TwoPointerApproach {
    public static void main(String[] args) {
        twoPointerApproachNaive(new int[]{3, 5, 9, 2, 8, 10, 11}, 17);
    }

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static void twoPointerApproachNaive(int arr[], int number) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum==number) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}
