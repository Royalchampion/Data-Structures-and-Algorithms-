public class ReverseColumnsOfAMatrix {
//    Time Complexity : O(m*n)
//    Auxiliary Space : O(1)
    public static void reverseCol(int matrix[][])
    {
        for(int i=0; i<matrix.length; i++) {
            int low = 0;
            int high = matrix[i].length-1;
            while(low <= high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}
