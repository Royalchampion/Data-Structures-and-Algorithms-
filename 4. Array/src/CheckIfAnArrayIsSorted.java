public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(isSortedNaive(new int[]{3, 6, 12, 21}));
        System.out.println(isSortedEfficient(new int[]{3, 4, 17, 44, 22}));
    }

    public static boolean isSortedNaive(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSortedEfficient(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            if (i==arr.length-1) {
                break;
            }
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}