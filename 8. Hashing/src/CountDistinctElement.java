public class CountDistinctElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 30};
        System.out.println(count(arr, arr.length));
    }
    
    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(1)
    public static int count(int[] arr, int n) {
        int count = 0;
        for (int i=0; i<n; i++) {
            boolean flag = false;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }
        return count;
    }
}
