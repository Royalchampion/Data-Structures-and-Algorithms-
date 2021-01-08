public class LargestElementInAnArray {
    public static void main(String[] args) {
        System.out.println(findLargestNaive(new int[]{8, 10, 12, 11}));
        System.out.println(findLargestAlternative(new int[]{5, 8, 12, 9}));
    }

//    Time complexity for this method is n^2.
    public static int findLargestNaive(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            boolean flag = true;
            for(int j=0; j<arr.length; j++) {
                if (arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

//    Time complexity for this method is n.
    public static int findLargestAlternative(int arr[]) {
        int result = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]>arr[result]) {
                result = i;
            }
        }
        return result;
    }
}
