public class EquilibriumPoint {
    public static void main(String[] args) {
        System.out.println(findEquilibriumPoint(new int[]{4, 1, -2}));
    }

    public static boolean findEquilibriumPoint(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j=0; j<i; j++) {
                leftSum += arr[j];
            }
            for (int k=i+1; k<arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum==rightSum) {
                return true;
            }
        }
        return false;
    }
}
