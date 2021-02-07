import java.util.ArrayList;

public class SumOfUpperAndLowerMatrix {
//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        int higherSum = 0;
        int lowerSum = 0;
        ArrayList<Integer> lowerAndHigherSum = new ArrayList<Integer>();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i<=j) {
                    higherSum += matrix[i][j];
                }
            }
        }
        lowerAndHigherSum.add(higherSum);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i>=j) {
                    lowerSum += matrix[i][j];
                }
            }
        }
        lowerAndHigherSum.add(lowerSum);
        return lowerAndHigherSum;
    }
}
