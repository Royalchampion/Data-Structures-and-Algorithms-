public class RepeatingElements {
    public static void main(String[] args) {
        System.out.println(findTheRepeatingElementNaive(new int[]{0, 2, 1, 3, 2, 2}));
    }

//    Time Complexity : O(n*n)
//    Auxiliary Space : O(1)
    public static int findTheRepeatingElementNaive(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
