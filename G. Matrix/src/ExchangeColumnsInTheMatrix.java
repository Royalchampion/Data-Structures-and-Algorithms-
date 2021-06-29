public class ExchangeColumnsInTheMatrix {
//    Time Complexity : O(m*n)
//    Auxiliary Space : O(1)
    public static void exchangeColumns(int matrix[][])
    {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<=matrix[i].length-1; j++) {
                if(j==0) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][j+matrix[i].length-1];
                    matrix[i][j+matrix[i].length-1] = temp;
                }
            }
        }
    }
}
