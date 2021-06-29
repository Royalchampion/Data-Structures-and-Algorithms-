public class RoofTop {
//    Time Complexity : O(n)
//    Auxiliary Space : O(1)
    static int maxStep(int A[], int N){
        int count = 0;
        int result = 0;
        for(int i=1; i<N; i++) {
            if((A[i]-A[i-1])>=1) {
                count++;
            }
            else {
                count = 0;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
