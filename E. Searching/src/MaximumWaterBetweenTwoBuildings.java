public class MaximumWaterBetweenTwoBuildings {

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static int findMaxCapacityNaive(int arr[]) {
        int result = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int current = (Math.min(arr[i], arr[j])*(j-i-1));
                result = Math.max(result, current);
            }
        }
        return result;
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(1)
    public static int findMaxCapacityEfficient(int height[]) {
        int i = 0;
        int j = height.length-1;
        int max = 0;

        while(i<j) {
            if(height[i] < height[j]) {
                max = Math.max(max, height[i]*(j-i-1));
                i++;
            }
            else if(height[j] < height[i]) {
                max = Math.max(max, height[j]*(j-i-1));
                j--;
            }
            else {
                max = Math.max(max, height[j]*(j-i-1));
                i++;
                j--;
            }
        }
        return max;
    }
}
