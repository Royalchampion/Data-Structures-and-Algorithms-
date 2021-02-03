public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 4, 7, 9, 3, 10, 5};
        quickSort(arr, 0, arr.length-1);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(1)
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitionPoint = haorePartition(arr, low, high);
            quickSort(arr, low, partitionPoint);
            quickSort(arr, partitionPoint + 1, high);
        }
    }

    public static int haorePartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i>=j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
