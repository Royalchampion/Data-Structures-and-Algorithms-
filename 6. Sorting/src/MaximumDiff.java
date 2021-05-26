public class MaximumDiff {
    //  Time Complexity : O(n)
    //  Auxiliary Space : O(n)
    static int maxIndexDiff(int arr[], int n) {
        int LMin[] = new int[n];
        int RMax[] = new int[n];

        LMin[0] = arr[0];
        for(int i=1; i<n; i++) {
            LMin[i] = Math.min(LMin[i-1], arr[i]);
        }

        RMax[n-1] = arr[n-1];
        for(int j=n-2; j>=0; j--) {
            RMax[j] = Math.max(RMax[j+1], arr[j]);
        }

        int i=0;
        int j=0;
        int maxDiff = 0;
        while(i<n && j<n) {
            if(LMin[i]<=RMax[j]) {
                maxDiff = Math.max(maxDiff, j-i);
                j++;
            }
            else {
                i++;
            }
        }

        return maxDiff;
    }
}
