import java.sql.Time;

public class FloorInASortedArray {
//    Time Comlexity : O(log(n))
//    Auxiliary Space : O(1)
    public static int floorSearch(int arr[], int low, int high, int x) {
        if(low > high) {
            return -1;
        }

        if(x >= arr[high]) {
            return high;
        }

        int mid = (low + high)/2;

        if (arr[mid]==x) {
            return mid;
        }
        if (arr[0] > 0 && arr[mid - 1]<=x && arr[mid]>x) {
            return mid-1;
        }
        if (arr[mid] > x) {
            return floorSearch(arr, low, mid - 1, x);
        }
        return floorSearch(arr, mid + 1, high, x);
    }
}
