import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        moveTheZerosNaive(new int[]{3, 1, 0, 0, 10, 0});
    }

//    Time Complexity : O(n^2)
    public static void moveTheZerosNaive(int arr[]) {
        int temp = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0) {
                for (int j=i+1; j<arr.length; j++) {
                    if (arr[j]!=0) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
