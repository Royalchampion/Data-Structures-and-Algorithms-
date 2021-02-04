// We solved this problem for pos and neg numbers but we can also solve this problem for even-odd and 0-1s.
public class SortAnElementWithTwoTypesOfArray {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 1, 1, 0};
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
            } while (arr[i] == 0);

            do {
                j--;
            } while (arr[j] == 1);

            if (i>j) {
                return;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
