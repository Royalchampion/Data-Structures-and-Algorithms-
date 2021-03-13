import java.util.HashMap;

public class CountDistinctElementInEveryWindow {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 10, 30, 40};
        printDistinct(arr, arr.length, 4);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(n)
    public static void printDistinct(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //  Insert the array elements till k to the hashmap.
        for (int i=0; i<k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        //  Print the hashmap size.
        System.out.print(map.size());

        //  Traverse the array from k to n.
        for (int i=k; i<n; i++) {
            //  Decrease the frequency of array elements.
            map.put(arr[i-k], map.get(arr[i-k]-1));

            //  If the frequency gets reduced to zero then remove it from the hashmap.
            if (map.get(arr[i-k])==0) {
                map.remove(arr[i-k]);
            }

            //  Now put all elements to the hashmap if it's not present or increase its frequency.
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            //  Print the size.
            System.out.print(map.size() + " ");
        }
    }
}
