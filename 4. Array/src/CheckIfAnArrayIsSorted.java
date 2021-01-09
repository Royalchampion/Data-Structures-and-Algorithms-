public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{3, 6, 12, 21}));
    }

    public static boolean isSorted(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}