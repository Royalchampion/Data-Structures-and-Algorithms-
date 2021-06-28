import java.util.Arrays;

public class DesignHashSet {
    //  Time Complexity : O(1)
    //  Auxiliary Space : O(n)
    boolean[] arr;
    /** Initialize your data structure here. */
    public DesignHashSet() {
        arr = new boolean[1000001];
        Arrays.fill(arr, false);
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
}
