public class MajorityElement {
    public static void main(String[] args) {
        majorityElement(new int[]{8, 7, 6, 8, 6, 6, 6, 6});
    }

//    Time Complexity : O(n^2)
//    Space Complexity : O(1)
    public static void majorityElement(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            int count = 0;
            for (int j=0; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
            if (count>=(arr.length)/2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
