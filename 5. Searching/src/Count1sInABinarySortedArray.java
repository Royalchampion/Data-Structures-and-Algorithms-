public class Count1sInABinarySortedArray {
    public static void main(String[] args) {
        System.out.println(countOnes(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

//    Time Complexity : O(log(n))
//    Auxiliary Space : O(1)
    public static int countOnes(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        while (high >= low) {
            int mid = (low + high)/2;
            if (arr[mid] == 0) {
                low = mid + 1;
            }
            else {
                if (mid==0 || arr[mid] != arr[mid-1]) {
                    return (arr.length - mid);
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
}
