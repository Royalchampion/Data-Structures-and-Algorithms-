public class CountingSort {
    public static void main(String[] args) {
        int temp[] = new int[]{1, 4, 4, 1, 0, 1};
        countSortNaive(temp, 6, 5);
        for (int i=0; i<temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

//  Time Complexity : O(n+k)
//  This algorithm can't be used as a general-purpose sorting algorithm for objects.
//  This algorithm can only be used for an array with integers.
    public static void countSortNaive(int[] arr, int n, int k) {
//      Initialize the count array with the respective count as zeros.
        int count[] = new int[k];
        for (int i=0; i<k; i++) {
            count[i] = 0;
        }

//      Increment the count on the basis of elements present in the count array.
        for (int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i=0; i<k; i++) {
            for (int j=0; j<count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
