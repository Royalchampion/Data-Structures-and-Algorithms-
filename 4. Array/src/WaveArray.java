public class WaveArray {
    public static void convertToWave(int arr[], int n){
        for (int i=0; i<arr.length-1; i+=2) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
