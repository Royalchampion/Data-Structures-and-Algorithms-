public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
//        findIntersectionNaive(new int[]{1, 20, 20, 20, 40, 50}, new int[]{2, 20, 20, 20});
        findIntersectionEfficient(new int[]{1, 20, 20, 20, 40, 50}, new int[]{2, 20, 20, 20});
    }

//    Time Complexity : O(m+n)
//    Auxiliary Space : O(1)
    public static void findIntersectionEfficient(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        while (i<m && j<n) {
            if ( i>0 && arr1[i]==arr1[i-1]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

//    Time Complexity : O(m*n)
//    Auxiliary Space : O(1)
    public static void findIntersectionNaive(int arr1[], int arr2[]) {
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
