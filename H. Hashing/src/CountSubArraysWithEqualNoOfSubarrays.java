import java.util.HashMap;

public class CountSubArraysWithEqualNoOfSubarrays {
    //  Time Complexity : O(n)
    //  Auxiliary Space : O(n)
    public static int count(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (int i=0; i<n; i++) {
            if (arr[i]==0) {
                arr[i] = -1;
            }
            sum += arr[i];
            if (sum==0) {
                count++;
            }
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            if (!map.containsKey(sum)) {
                count += map.put(sum, 1);
            }
            else {
                count += map.put(sum, map.get(sum)+1);
            }
        }
        return count;
    }
}
