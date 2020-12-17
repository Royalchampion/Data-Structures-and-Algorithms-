public class TwoOddNumberOccuring {
    public static void main(String[] args) {
        oddAppearingNaive(new int[]{4, 4, 4, 4, 5, 3, 3, 3});
    }

    public static void oddAppearingNaive(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            int count=0;
            for (int j=0; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
            if (count%2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
