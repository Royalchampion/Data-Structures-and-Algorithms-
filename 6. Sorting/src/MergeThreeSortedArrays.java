import java.util.ArrayList;

public class MergeThreeSortedArrays {
    public static void main(String[] args) {
        int A[] = { 1, 2, 41, 52, 84 };
        int B[] = { 1, 2, 41, 52, 67 };
        int C[] = { 1, 2, 41, 52, 67, 85 };
        System.out.println(findResult(A, B, C));
    }

//    Time Complexity : O(m+n+o)
//    Auxiliary Space : O(m+n+o)
    public static ArrayList<Integer> findResult(int[] A, int[] B, int[] C) {
        int i=0, j=0, k=0;
        int m = A.length;
        int n = B.length;
        int o = C.length;
        ArrayList<Integer> list = new ArrayList<Integer>(m+n+o);
        while(i<m && j<n && k<o) {
            if (A[i]<=B[j] && A[i]<=C[k]) {
                list.add(A[i]);
                i++;
            }
            else if(B[j]<=A[i] && B[j]<=C[k]) {
                list.add(B[j]);
                j++;
            }
            else {
                list.add(C[k]);
                k++;
            }
        }
        while(i<m && j<n) {
            if (A[i]<B[j]) {
                list.add(A[i]);
                i++;
            }
            else {
                list.add(B[j]);
                j++;
            }
        }
        while (j<n && k<o) {
            if (B[j]<C[k]) {
                list.add(B[j]);
                j++;
            }
            else {
                list.add(C[k]);
                k++;
            }
        }
        while (i<m && k<o) {
            if (A[i]<C[k]) {
                list.add(A[i]);
                i++;
            }
            else {
                list.add(C[k]);
                k++;
            }
        }
        while (i<m) {
            list.add(A[i]);
            i++;
        }
        while (j<n) {
            list.add(B[j]);
            j++;
        }
        while (k<o) {
            list.add(C[k]);
            k++;
        }
        return list;
    }
}
