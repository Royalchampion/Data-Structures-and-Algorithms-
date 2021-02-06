public class MultiDimensionalArray {
    public static void main(String[] args) {
        int m=3, n=2;
        int arr[][] = new int[m][n];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        int a[][] = {{3, 4, 5},
                     {5, 1, 9}};
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
