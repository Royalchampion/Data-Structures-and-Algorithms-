import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //  Time Complexity : O(1)
    //  Auxiliary Space : O(l)
    /*
    private static final int MAX_VALUE = 1000000;
    private static final int ARRAY_SIZE = 100;
    List<List<Integer>> list;

    public MyHashSet() {
        list = new ArrayList<>(ARRAY_SIZE);
        for (int i=0; i<ARRAY_SIZE; i++) {
            list.add(null);
        }
    }

    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = list.get(index);
        if(childList==null) {
            List<Integer> newList = new LinkedList<>();
            newList.add(key);
            list.set(index, newList);
        }
        else {
            if(!childList.contains(key)) {
                childList.add(key);
            }
        }
    }

    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = list.get(index);
        if(childList!=null) {
            childList.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = list.get(index);
        return childList != null && childList.contains(key);
    }
    */
}
