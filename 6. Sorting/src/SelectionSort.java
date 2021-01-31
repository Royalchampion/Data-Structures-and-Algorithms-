import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {3, 12, 4, 1, 5, 6};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(n)
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        for (int i=0; i<n; i++) {
            int minInd = 0;
            for (int j=1; j<n; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            temp[i] = arr[minInd];
            arr[minInd] = Integer.MAX_VALUE;
        }

//        Copy every elements from temp array to the original array.
        for (int i=0; i<arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
