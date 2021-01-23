public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(findMajority(new int[]{8, 8, 4, 6, 6, 6, 5, 6}));
    }

//    Time Complexity : O(n)
//    Auxiliary Space : O(1)
    public static int findMajority(int arr[]) {
//        Find the candidate.
        int result = 0;
        int count = 1;
        for (int i=1; i<arr.length; i++) {
            if (arr[result]==arr[i]) {
                count++;
            }
            else {
                count--;
            }
            if (count==0) {
                result = i;
                count = 1;
            }
        }
//        Check if candidate is actually a majority.
        count = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[result]==arr[i]) {
                count++;
            }
        }
        if (count<=arr.length/2) {
            return arr[result];
        }
        return -1;
    }
}
