import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {10, 15, 20, 20};
        int b[] = {1, 12};
        mergeSort(a, b);
    }

//    Time Complexity : O((m+n)log(m+n))
//    Auxiliary Space : O(m+n)
    public static void mergeSort(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int c[] = new int[m+n];
        for (int i = 0; i<m; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j<n; j++) {
            c[m+j] = b[j];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
