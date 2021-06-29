public class MultiplyTwoMatrix {
//    Time Complexity : O(m1*n2*n1)
//    Auxiliary Space : O(m1*n2)
    public static int[][] calcMulti(int A[][], int B[][]) {
        int m1 = A.length;
        int n1 = A[0].length;
        int m2 = B.length;
        int n2 = B[0].length;

        if (m1==n2) {
            int temp[][] = new int[m1][n2];
            for (int i=0; i<m1; i++) {
                for (int j=0; j<n2; j++) {
                    int sum=0;
                    for (int k=0; k<n1; k++) {
                        sum += A[i][k] + B[k][j];
                    }
                    temp[i][j] = sum;
                }
            }
            return temp;
        }
        else {
            int temp[][] = new int[0][0];
            return temp;
        }
    }
}
