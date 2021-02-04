public class SortAnElementWithTwoTypesOfArray {
    public static void main(String[] args) {
        int arr[] = new int[]{13, -12, 18, -10};
        segregatePosNeg(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(1)
    public static void segregatePosNeg(int arr[]) {
        int n = arr.length;
        int i = -1;
        int j = n;
        while (i <= j) {
            do {
                i++;
            } while (arr[i] < 0);

            do {
                j--;
            } while (arr[j] > 0);

            if (i>j) {
                return;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
