public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        printBoundaryElements(arr);
    }

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static void printBoundaryElements(int arr[][]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (i == 0) {
                    System.out.print(arr[i][j] + " ");
                }
                else if (i == arr.length-1) {
                    System.out.print(arr[i][j] + " ");
                }
                else if (j == 0) {
                    System.out.print(arr[i][j] + " ");
                }
                else if (j == arr.length-1){
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print("");
                }
            }
        }
    }
}
