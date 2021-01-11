import java.util.Arrays;

public class LeftRotateAnArrayByDPosition {
    public static void main(String[] args) {
        leftRotateNaive(new int[]{4, 1, 2, 8, 10}, 3);
        leftRotateBetter(new int[]{3, 1, 22, 44, 11}, 4);
    }

////////////////////////////////////////////////////////////////////////////////////////
//    Time Complexity : O(n);
//    Auxiliary Space : O(D)
    public static void leftRotateBetter(int arr[], int D) {
        int temp[] = new int[D];
        for (int i=0; i<D; i++) {
            temp[i] = arr[i];
        }
        for (int i=D; i<arr.length; i++) {
            arr[i-D] = arr[i];
        }
        for (int i=0; i<D; i++) {
            arr[arr.length-D+i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

/////////////////////////////////////////////////////////////////////////////////////////
//    Time Complexity : O(nD)
//    Auxiliary Space : O(1)
    public static void leftRotateNaive(int arr[], int D) {
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
