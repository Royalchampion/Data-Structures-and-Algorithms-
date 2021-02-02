// A program to partition the elements of the array around the specified element.
public class PartitionAGivenArray {
    public static void main(String[] args) {
//        naivePartition(new int[]{10, 80, 30, 90, 40, 50, 70}, 0, 6, 6);
        System.out.println(lomutoPartition(new int[]{10, 80, 30, 90, 40, 50, 70}, 0, 6));
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(n)
    public static void naivePartition(int arr[], int low, int high, int partitionPoint) {
        int temp[] = new int[high-low+1];
        int index = 0;
        for (int i=low; i<=high; i++) {
            if (arr[i]<=arr[partitionPoint]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int j=low; j<=high; j++) {
            if (arr[j]>arr[partitionPoint]) {
                temp[index] = arr[j];
                index++;
            }
        }
        for (int k=low; k<high; k++) {
            arr[k] = temp[k-low];
        }
    }

//    In this consideration, we're assuming the last element as a pivot element.
//    Time Complexity : O(n)
//    Auxiliary Space : O(1)
    public static int lomutoPartition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j=low; j<=arr.length-1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }
}
