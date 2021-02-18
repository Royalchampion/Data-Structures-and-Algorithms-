public class WaveArray {
    public static void convertToWave(int arr[], int n){
//         This method only works if the given array is sorted.
//         Time Complexity : O(n)
//         Auxiliary Space : O(1)
        for (int i=0; i<arr.length-1; i+=2) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
