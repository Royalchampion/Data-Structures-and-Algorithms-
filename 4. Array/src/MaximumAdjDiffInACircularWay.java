public class MaximumAdjDiffInACircularWay {
    public static int minAdjDiff(int arr[], int n) {
        int minAdjDiff = 0;
        int result = 0;

        if (arr[0] > arr[arr.length-1]) {
            result = arr[0] - arr[arr.length - 1];
        }
        else {
            result = arr[arr.length - 1] - arr[0];
        }

        for (int i=0; i<=arr.length-2; i++) {
            if(arr[i] > arr[i+1]) {
                minAdjDiff = arr[i] - arr[i+1];
                result = Math.min(result, minAdjDiff);
            }
            else {
                minAdjDiff = arr[i+1] - arr[i];
                result = Math.min(result, minAdjDiff);
            }
        }

        return result;
    }
}
