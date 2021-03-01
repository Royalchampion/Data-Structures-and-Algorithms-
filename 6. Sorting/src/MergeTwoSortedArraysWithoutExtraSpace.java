public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = new int[]{3, 5, 6, 8, 12};
        int arr2[] = new int[]{1, 4, 9, 13};
        mergeArrays(arr1, arr2, arr1.length, arr2.length);
    }

//    Time Complexity : O(m*n)
//    Auxiliary Space : O(1)
    public static void mergeArrays(int[] arr1, int[] arr2, int m, int n) {
        for (int i=0; i<m; i++) {
            if (arr1[i]>arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }

            int firstElement = arr2[0];
            int k;
            for (k=1; k<n && arr2[k]<firstElement; k++) {
                arr2[k-1] = arr2[k];
            }
            arr2[k-1] = firstElement;
        }
        for (int i:arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j:arr2) {
            System.out.print(j + " ");
        }
    }
}
