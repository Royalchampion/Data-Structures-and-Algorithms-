public class SearchInARowWiseAndColumnWiseSortedArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 22},
                        {5, 6, 7, 8, 17, 19},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        search(arr, 19);
    }

//    Time Complexity : O(m*n)
//    Auxiliary SpacE : O(1)
    public static void search(int arr[][], int x) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j]==x) {
                    System.out.print("Place of x : " + i + " & " + j);
                    return;
                }
            }
        }
        System.out.print("Not Found!");
    }
}
