public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        findIntersection(new int[]{1, 20, 20, 20, 40, 50}, new int[]{2, 20, 20, 20});
    }

//    Time Complexity : O(m*n)
//    Auxiliary Space : O(1)
    public static void findIntersection(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        for (int i=1; i<m; i++) {
            if (arr1[i]==arr1[i-1]) {
                continue;
            }
            for(int j=0; j<n; j++) {
                if (arr1[i]==arr2[j]) {
                    System.out.print(arr1[i]);
                    break;
                }
            }
        }
    }
}
