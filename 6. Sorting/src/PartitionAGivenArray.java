// A program to partition the elements of the array around the specified element.
public class PartitionAGivenArray {
    public static void main(String[] args) {

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
}
