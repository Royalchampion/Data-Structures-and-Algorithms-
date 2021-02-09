public class InterchangeTheRows {
//    Time Complexity : O(m)
    public static void interchangeRows(int matrix[][])
    {
        int low = 0;
        int high = matrix.length-1;
        while(low <= high) {
            int temp[] = matrix[low];
            matrix[low] = matrix[high];
            matrix[high] = temp;
            low++;
            high--;
        }
    }
}
