public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        System.out.println(secondLargestElementInAnArrayNaive(new int[]{5, 8, 18, 21, 16}));
    }

    public static int secondLargestElementInAnArrayNaive(int arr[]) {
        int largest = findLargest(arr);
        int result = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]!=arr[largest]) {
                if (result==-1) {
                    result = i;
                }
                else if (arr[result]<arr[i]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static int findLargest(int arr[]) {
        int result = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]>arr[result]) {
                result = i;
            }
        }
        return result;
    }
}
