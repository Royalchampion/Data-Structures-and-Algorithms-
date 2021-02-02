// A pair(arr[i], arr[j]) forms a pair when i<j and arr[i]>arr[j]
public class CountInversionsInAnArray {
    public static void main(String[] args) {
        System.out.println(countInversionsNaive(new int[]{40, 30, 20, 10}));
    }

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static int countInversionsNaive(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if ((j > i) && (arr[i]>arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
