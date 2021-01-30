public class MaximumWaterBetweenTwoBuildings {
//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static int findMaxCapacity(int arr[]) {
        int result = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int current = (Math.min(arr[i], arr[j])*(j-i-1));
                result = Math.max(result, current);
            }
        }
        return result;
    }
}
