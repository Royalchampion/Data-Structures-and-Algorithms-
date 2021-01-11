import java.util.Arrays;

public class LeftRotateAnArrayByDPosition {
    public static void main(String[] args) {
        leftRotate(new int[]{4, 1, 2, 8, 10}, 3);
    }

//    Time Complexity : O(nD)
//    Auxiliary Space : O(1)
    public static void leftRotate(int arr[], int D) {
        for (int i=1; i<=D; i++) {
            int temp = arr[0];
            for (int j=1; j<arr.length; j++) {
                arr[j-1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
