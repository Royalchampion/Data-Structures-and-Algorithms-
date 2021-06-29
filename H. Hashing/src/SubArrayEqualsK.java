import java.util.HashMap;

public class SubArrayEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(check(arr, arr.length, 2));
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(n)
    public static int check(int[] arr, int n, int k) {
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> keys = new HashMap<>();
        keys.put(0, 1);
        for (int i=0; i<arr.length; i++) {
            prefixSum += arr[i];
            if (keys.containsKey(prefixSum-k)) {
                count += keys.get(prefixSum-k);
            }
            keys.put(prefixSum, keys.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}
