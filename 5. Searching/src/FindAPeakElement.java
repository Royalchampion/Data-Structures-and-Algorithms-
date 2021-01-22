// A peak element is an element which is greater than both of its neighbours.
public class FindAPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakNaive(new int[]{10, 7, 8, 20, 12}));
    }

//    Time Complexity : O(n)
//    Space Complexity : O(1)
    public static int findPeakNaive(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr[0] >= arr[1]) {
            return arr[0];
        }
        if (arr[arr.length-1] >= arr[arr.length-2]) {
            return arr[arr.length-1];
        }
        int i = 1;
        while (i<arr.length-1) {
            if ((arr[i] >= arr[i-1]) && (arr[i] >= arr[i+1])) {
                return arr[i];
            }
            i++;
        }
        return -1;
    }
}
