public class LargestElementInAnArray {
    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{8, 10, 12, 11}));
    }

    public static int findLargest(int arr[]) {
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
}
